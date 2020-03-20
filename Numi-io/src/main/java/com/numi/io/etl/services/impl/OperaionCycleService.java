package com.numi.io.etl.services.impl;

import com.numi.io.common.CommonConstants;
import com.numi.io.common.DateConstants;
import com.numi.io.entities.BrSyncTimestamp;
import com.numi.io.entities.MfgEntityactual;
import com.numi.io.entities.MfgEntityoperationcycle;
import com.numi.io.entities.TechnologyTpoperation;
import com.numi.io.repository.*;
import com.numi.io.etl.services.EtlBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class OperaionCycleService implements EtlBaseService {

    private static final Logger logger = LoggerFactory.getLogger(OperaionCycleService.class);

    @Autowired
    BrNgavsEntityActualRepository entityActualRepository;

    @Autowired
    BrSyncTimestampRepository brSyncTimestampRepository;

    @Autowired
    MfgEntityactualRepository mfgEntityactualRepository;

    @Autowired
    MfgEntityoperationcycleRepository mfgEntityoperationcycleRepository;

    @Autowired
    TechnologyTpoperationRepository technologyTpoperationRepository;

    @Transactional(rollbackOn={Exception.class})
    @Override
    public void transformation() {

        try {
            //根据时间戳查询数据
            BrSyncTimestamp brSyncTimestamp = brSyncTimestampRepository.findByCode("entityOperaionCycle");

            LocalDateTime dateTime = null;
            if (brSyncTimestamp == null || brSyncTimestamp.getSyncTime() == null) {
                dateTime = LocalDateTime.parse("1970-01-01 00:00:00", DateConstants.df);
                brSyncTimestamp = new BrSyncTimestamp();
                brSyncTimestamp.setCode("entityOperaionCycle");
            } else {
                dateTime = brSyncTimestamp.getSyncTime();
            }
            //从ngavs生产履历表里抽数据
            List<MfgEntityactual> mfgEntityactuals =
                    mfgEntityactualRepository.queryByCreateDate(dateTime);

            if (mfgEntityactuals == null || mfgEntityactuals.size() == 0 ){

                logger.info("未查询到需要做转换处理的数据,entityOperaionCycle");
                return;
            }

            //记录当前同步的时间戳
            LocalDateTime maxDateTime = mfgEntityactuals.get(mfgEntityactuals.size() - 1).getCreateDate();

            for (MfgEntityactual mfgEntityactual : mfgEntityactuals) {
                //
                MfgEntityoperationcycle mfgEntityoperationcycle = mfgEntityoperationcycleRepository.findByEntityCode(mfgEntityactual.getEntityCode());


                if (mfgEntityoperationcycle == null || mfgEntityoperationcycle.getId() == null) {
                    mfgEntityoperationcycle = new MfgEntityoperationcycle();

                    mfgEntityoperationcycle.setCatalogmodelCode(mfgEntityactual.getCatalogmodelCode());
                    mfgEntityoperationcycle.setCatalogoptionCode(mfgEntityactual.getCatalogoptionCode());
                    mfgEntityoperationcycle.setCatalogcolorCode(mfgEntityactual.getCatalogcolorCode());
                    mfgEntityoperationcycle.setProductCode(mfgEntityactual.getProductCode());
                    mfgEntityoperationcycle.setEntityCode(mfgEntityactual.getEntityCode());
                    mfgEntityoperationcycle.setCreateDate(LocalDateTime.now());
                    mfgEntityoperationcycle.setCreateUser("SYSTEM");
                }
                //根据TP找工序段和TP类型
                TechnologyTpoperation technologyTpoperation = technologyTpoperationRepository.
                        findByTpCode(mfgEntityactual.getOperationTp());

                if (technologyTpoperation == null ) {
                    logger.error("当前制品生产履历的工序TP信息在系统中不存在,TP={}",mfgEntityactual.getOperationTp());
                    continue;
                }
                mfgEntityoperationcycle.setTechnologyoperationCode(technologyTpoperation.getOperationCode());
                mfgEntityoperationcycle.setUpdateDate(LocalDateTime.now());
                mfgEntityoperationcycle.setUpdateUser("SYSTEM");
                //进入
                if (CommonConstants.CNST_TP_TYPE_0.equals(technologyTpoperation.getTpType())) {

                    mfgEntityoperationcycle.setOperationactualTpin(technologyTpoperation.getOperationCode());
                    mfgEntityoperationcycle.setOperationactualActstarttime(mfgEntityactual.getEntityactualActPasstime());
                    // TODO
                    mfgEntityoperationcycle.setOperationactualActstartworktime(LocalDateTime.now());
                    mfgEntityoperationcycle.setOperationactualActstartshift("");

                } else {
                //出
                    mfgEntityoperationcycle.setOperationactualTpout(technologyTpoperation.getOperationCode());
                    mfgEntityoperationcycle.setOperationactualActendtime(mfgEntityactual.getEntityactualActPasstime());
                    // TODO
                    mfgEntityoperationcycle.setOperationactualActendworktime(LocalDateTime.now());
                    mfgEntityoperationcycle.setOperationactualActendshift("");
                }

                //in out 均有值后计算差值
                if (mfgEntityoperationcycle.getOperationactualTpin() != null
                        && mfgEntityoperationcycle.getOperationactualTpout() != null) {

                    Duration between = Duration.between
                            (mfgEntityoperationcycle.getOperationactualActstarttime(),
                                    mfgEntityoperationcycle.getOperationactualActendtime());

                    mfgEntityoperationcycle.setOperationactualCycle(new BigDecimal(between.getSeconds()));
                    mfgEntityoperationcycle.setOperationactualStaytime(new BigDecimal(between.getSeconds()));
                    // TODO
                    mfgEntityoperationcycle.setOperationactualStaystand(new BigDecimal("0"));

                } else if (mfgEntityoperationcycle.getOperationactualTpin() != null
                        && mfgEntityoperationcycle.getOperationactualTpout() == null){
                    Duration between = Duration.between
                            (mfgEntityoperationcycle.getOperationactualActstarttime(),
                                    LocalDateTime.now());
                    mfgEntityoperationcycle.setOperationactualCycle(new BigDecimal(0));
                    mfgEntityoperationcycle.setOperationactualStaytime(new BigDecimal(between.getSeconds()));
                }

                mfgEntityoperationcycleRepository.save(mfgEntityoperationcycle);
            }
            //修改同步时间
            brSyncTimestamp.setSyncTime(maxDateTime);
            brSyncTimestampRepository.save(brSyncTimestamp);

        } catch (Exception e) {
            logger.error("发生系统异常",e);
        }


    }
}
