package com.numi.io.quartz.task;

import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.*;
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

@Service
@DisallowConcurrentExecution
public class OtdEntityCycleWithManufactureService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OtdEntityCycleWithManufactureService.class);

    @Autowired
    private OtdEntitynodeactualRepository otdEntitynodeactualRepository;

    @Autowired
    BrSyncTimestampRepository brSyncTimestampRepository;

    @Autowired
    MfgManufactureplanentityRepository mfgManufactureplanentityRepository;

    @Autowired
    TechnologyTechoperationRepository technologyTechoperationRepository;

    @Autowired
    MfgEntityoperationcycleRepository mfgEntityoperationcycleRepository;

    @Autowired
    OtdEntitycycleRepository otdEntitycycleRepository;

    @Autowired
    MfgManufactureplanviewRepository mfgManufactureplanviewRepository;

    @Autowired
    OtdCyclephaseoperationRepository otdCyclephaseoperationRepository;

    @Transactional(rollbackOn = {Exception.class})
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {


        String param = QuartzUtils.getJobParam(jobExecutionContext.getJobDetail().getJobDataMap());

        exec();


    }

    public void exec() {
        LocalDateTime startTime = LocalDateTime.now();

        try {
            logger.info("开始计算[制品阶段周期],time={}", startTime);

            //根据时间戳查询数据
            BrSyncTimestamp brSyncTimestamp = brSyncTimestampRepository.findByCode("OtdEntityCycleWithManufactureService");

            LocalDateTime dateTime = null;
            if (brSyncTimestamp == null || brSyncTimestamp.getSyncTime() == null) {
                dateTime = LocalDateTime.parse("1970-01-01 00:00:00", DateConstants.df);
                brSyncTimestamp = new BrSyncTimestamp();
                brSyncTimestamp.setCode("OtdEntityCycleWithManufactureService");
            } else {
                dateTime = brSyncTimestamp.getSyncTime();
            }
            //从节点表抽数据
            List<OtdEntitynodeactual> otdEntitynodeactuals = otdEntitynodeactualRepository.
                    queryByCreateDateAndCyclephasenodeType(dateTime, "1");

            if (otdEntitynodeactuals == null || otdEntitynodeactuals.size() == 0) {

                logger.info("未查询到需要做转换处理的数据,OtdEntityCycleWithManufactureService");
                return;
            }

            logger.info("从节点表查询到数据otdEntitynodeactuals.size={}", otdEntitynodeactuals.size());

            //记录当前同步的时间戳
            LocalDateTime maxDateTime = otdEntitynodeactuals.get(otdEntitynodeactuals.size() - 1).getCreateDate();

            for (OtdEntitynodeactual otdEntitynodeactual : otdEntitynodeactuals) {
                logger.info("开始计算entity={}", otdEntitynodeactual.getEntityCode());
                //根据工艺找工序
                List<OtdCyclephaseoperation> otdCyclephaseoperations = otdCyclephaseoperationRepository
                        .findByCyclephaseCodeAndDeptCode(otdEntitynodeactual.getCyclephaseCode(), otdEntitynodeactual.getDeptCode());

                if (otdCyclephaseoperations == null || otdCyclephaseoperations.size() == 0) {
                    logger.warn("根据阶段代码未找到工序,阶段代码={}", otdEntitynodeactual.getCyclephaseCode());
                    continue;
                }
                BigDecimal cycle = new BigDecimal(0);
                BigDecimal staytime = new BigDecimal(0);
                //循环工序,查出制品对应所有工序阶段的时间合计
                boolean flg = true;
                for (OtdCyclephaseoperation otdCyclephaseoperation : otdCyclephaseoperations) {
                    //根据VIN+工艺工序查询制品周期
                    MfgEntityoperationcycle mfgEntityoperationcycle = mfgEntityoperationcycleRepository.
                            findByEntityCodeAndOperationCode
                                    (otdEntitynodeactual.getEntityCode(), otdCyclephaseoperation.getOperationCode());

                    if (mfgEntityoperationcycle == null
                            || mfgEntityoperationcycle.getOperationactualCycle() == null
                            || mfgEntityoperationcycle.getOperationactualCycle().equals(new BigDecimal(0))) {
                        flg = false;//阶段周期为0
                    }

                    if (mfgEntityoperationcycle != null) {
                        cycle = cycle.add(mfgEntityoperationcycle.getOperationactualCycle() == null ? new BigDecimal(0) : mfgEntityoperationcycle.getOperationactualCycle());
                        staytime = staytime.add(mfgEntityoperationcycle.getOperationactualStaytime() == null ? new BigDecimal(0) : mfgEntityoperationcycle.getOperationactualStaytime());
                    }
                }
                if (staytime.intValue() == 0) {
                    logger.warn("entity停留时间为0,不写入数据库中,entity_code={}", otdEntitynodeactual.getEntityCode());
                    continue;
                }
                logger.info("entity_code={},这个有数据", otdEntitynodeactual.getEntityCode());
                OtdEntitycycle otdEntitycycle = otdEntitycycleRepository.findByEntityCodeAndDeptCodeAndCyclephaseCode(otdEntitynodeactual.getEntityCode(),
                        otdEntitynodeactual.getDeptCode(), otdEntitynodeactual.getCyclephaseCode());
                if (otdEntitycycle == null) {
                    otdEntitycycle = new OtdEntitycycle();
                }
                otdEntitycycle.setEntityCode(otdEntitynodeactual.getEntityCode());
                otdEntitycycle.setDeptCode(otdEntitynodeactual.getDeptCode());
                otdEntitycycle.setCycleactCycletime(flg ? cycle : new BigDecimal(0));
                otdEntitycycle.setCycleactStaytime(staytime);
                otdEntitycycle.setCyclephaseCode(otdEntitynodeactual.getCyclephaseCode());
                otdEntitycycle.setCreateDate(LocalDateTime.now());
                otdEntitycycle.setCreateUser("SYSTEM");
                otdEntitycycle.setUpdateDate(LocalDateTime.now());
                otdEntitycycle.setUpdateUser("SYSTEM");
                otdEntitycycleRepository.save(otdEntitycycle);
            }

            brSyncTimestamp.setSyncTime(maxDateTime);
            brSyncTimestampRepository.save(brSyncTimestamp);

            LocalDateTime endTime = LocalDateTime.now();
            logger.info("[制品阶段周期]计算完成,time={},耗时={}", endTime, Duration.between(startTime, endTime).getSeconds());
        } catch (Exception e) {
            logger.error("发生系统异常", e);
        }
    }
}
