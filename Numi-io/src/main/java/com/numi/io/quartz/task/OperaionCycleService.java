package com.numi.io.quartz.task;

import com.numi.io.common.constants.CommonConstants;
import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.BrSyncTimestamp;
import com.numi.io.common.entities.MfgEntityactual;
import com.numi.io.common.entities.MfgEntityoperationcycle;
import com.numi.io.common.entities.OtdPhaseNodeTpComponent;
import com.numi.io.common.repository.*;
import com.numi.io.quartz.utils.QuartzUtils;
import org.apache.commons.lang3.StringUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
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
@DisallowConcurrentExecution
public class OperaionCycleService implements Job {

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
    OtdCyclenodetpRepository otdCyclenodetpRepository;

    @Autowired
    TechnologyTpoperationRepository technologyTpoperationRepository;

    @Autowired
    OtdEntitynodeactualService otdEntitynodeactualService;

    @Autowired
    MfgManufactureplanentityRepository mfgManufactureplanentityRepository;

    @Autowired
    OtdPhaseNodeTpComponentRepository otdPhaseNodeTpComponentRepository;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String param = QuartzUtils.getJobParam(jobExecutionContext.getJobDetail().getJobDataMap());

        exec(param);

    }

    public void exec(String param) {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            logger.info("开始计算[制品工序周期],time={}", startTime);
            //根据时间戳查询数据
            BrSyncTimestamp brSyncTimestamp = brSyncTimestampRepository.findByCode("MfgEntityOperaionCycle");

            LocalDateTime dateTime = null;
            if (brSyncTimestamp.getSyncTime() == null) {
                dateTime = LocalDateTime.parse("1970-01-01 00:00:00", DateConstants.df);
            } else {
                dateTime = brSyncTimestamp.getSyncTime();
            }
            //从ngavs生产履历表里抽数据
            List<MfgEntityactual> mfgEntityactuals =
                    mfgEntityactualRepository.queryByCreateDate(dateTime);

            if (mfgEntityactuals == null || mfgEntityactuals.size() == 0) {

                logger.info("未查询到需要做转换处理的数据,entityOperaionCycle");
                return;
            }

            logger.info("[制品工序周期],mfgEntityactuals.size={}", mfgEntityactuals.size());

            //记录当前同步的时间戳
            LocalDateTime maxDateTime = mfgEntityactuals.get(mfgEntityactuals.size() - 1).getCreateDate();


            //加载阶段节点TP关系信息
            List<OtdPhaseNodeTpComponent> otdPhaseNodeTpComponents = otdPhaseNodeTpComponentRepository.findAll();

            int row = 1;
            for (MfgEntityactual mfgEntityactual : mfgEntityactuals) {
                //
                logger.info("第{}条,vin={}", row, mfgEntityactual.getEntityCode());
                //
                MfgEntityoperationcycle mfgEntityoperationcycle = mfgEntityoperationcycleRepository.
                        findByEntityCodeAndOperationCode(mfgEntityactual.getEntityCode(), mfgEntityactual.getOperationCode());
                if (mfgEntityoperationcycle == null || mfgEntityoperationcycle.getId() == null) {
                    mfgEntityoperationcycle = new MfgEntityoperationcycle();

                    mfgEntityoperationcycle.setCatalogmodelCode(mfgEntityactual.getCatalogmodelCode());
                    mfgEntityoperationcycle.setCatalogoptionCode(mfgEntityactual.getCatalogoptionCode());
                    mfgEntityoperationcycle.setCatalogcolorCode(mfgEntityactual.getCatalogcolorCode());
                    mfgEntityoperationcycle.setProductCode(mfgEntityactual.getProductCode());
                    mfgEntityoperationcycle.setEntityCode(mfgEntityactual.getEntityCode());
                    mfgEntityoperationcycle.setOperationCode(mfgEntityactual.getOperationCode());
                    mfgEntityoperationcycle.setCreateDate(LocalDateTime.now());
                    mfgEntityoperationcycle.setCreateUser("SYSTEM");
                }


                mfgEntityoperationcycle.setUpdateDate(LocalDateTime.now());
                mfgEntityoperationcycle.setUpdateUser("SYSTEM");
                //进入
                if (CommonConstants.CNST_TP_TYPE_0.equals(mfgEntityactual.getOperationType())) {

                    mfgEntityoperationcycle.setOperationactualTpin(mfgEntityactual.getOperationTp());
                    mfgEntityoperationcycle.setOperationactualActstarttime(mfgEntityactual.getEntityactualActPasstime());
                    // TODO
                    mfgEntityoperationcycle.setOperationactualActstartworktime(LocalDateTime.now());
                    mfgEntityoperationcycle.setOperationactualActstartshift("");

                } else {
                    //出
                    mfgEntityoperationcycle.setOperationactualTpout(mfgEntityactual.getOperationTp());
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
                        && mfgEntityoperationcycle.getOperationactualTpout() == null) {
                    Duration between = Duration.between
                            (mfgEntityoperationcycle.getOperationactualActstarttime(),
                                    LocalDateTime.now());
                    mfgEntityoperationcycle.setOperationactualCycle(new BigDecimal(0));
                    mfgEntityoperationcycle.setOperationactualStaytime(new BigDecimal(between.getSeconds()));
                }

                mfgEntityoperationcycleRepository.save(mfgEntityoperationcycle);

                if (CommonConstants.CNST_QUARTZ_PARAM_CONTINUE.equals(param)) {

                    logger.info("开始计算[制品节点履历表],entityCode={}", mfgEntityactual.getEntityCode());
                    for (OtdPhaseNodeTpComponent otdPhaseNodeTpComponent : otdPhaseNodeTpComponents) {
                        if (otdPhaseNodeTpComponent.getTpcode().equals(mfgEntityactual.getOperationTp())) {

                            otdEntitynodeactualService.analyzeToEntityNodeActual(mfgEntityactual,otdPhaseNodeTpComponent,param);
                        }
                        break;
                    }


                }
                row++;
            }
            //修改同步时间
            brSyncTimestamp.setSyncTime(maxDateTime);
            brSyncTimestampRepository.save(brSyncTimestamp);
            LocalDateTime endTime = LocalDateTime.now();
            logger.info("[制品工序周期]计算完成,time={},耗时={}", endTime, Duration.between(startTime, endTime).getSeconds());
        } catch (Exception e) {
            logger.error("发生系统异常", e);
        }
    }
}
