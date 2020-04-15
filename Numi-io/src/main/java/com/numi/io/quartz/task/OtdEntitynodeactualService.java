package com.numi.io.quartz.task;

import com.numi.io.common.constants.CommonConstants;
import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.*;
import com.numi.io.common.repository.*;
import com.numi.io.quartz.service.BatchService;
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

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@DisallowConcurrentExecution
public class OtdEntitynodeactualService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OtdEntitynodeactualService.class);


    @Autowired
    private MfgEntityactualRepository mfgEntityactualRepository;

    @Autowired
    private OtdEntitynodeactualRepository otdEntitynodeactualRepository;

    @Autowired
    private OtdCyclenodetpRepository otdCyclenodetpRepository;

    @Autowired
    private OtdCurrentcyclenodeRepository otdCurrentcyclenodeRepository;

    @Autowired
    BrSyncTimestampRepository brSyncTimestampRepository;

    @Autowired
    OtdCurrentCycleNodeService otdCurrentCycleNodeService;

    @Autowired
    OtdPhaseNodeTpComponentRepository otdPhaseNodeTpComponentRepository;

    @Autowired
    BatchService batchService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        String param = QuartzUtils.getJobParam(jobExecutionContext.getJobDetail().getJobDataMap());
        exec(param);

    }

    public void exec(String param) {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            logger.info("开始计算[制品节点履历表],time={}", startTime);
            //根据时间戳查询数据
            BrSyncTimestamp brSyncTimestamp = brSyncTimestampRepository.findByCode("OtdEntitynodeactual");

            LocalDateTime dateTime = null;
            if (brSyncTimestamp == null || brSyncTimestamp.getSyncTime() == null) {
                dateTime = LocalDateTime.parse("1970-01-01 00:00:00", DateConstants.df);
                brSyncTimestamp = new BrSyncTimestamp();
                brSyncTimestamp.setCode("OtdEntitynodeactual");
            } else {
                dateTime = brSyncTimestamp.getSyncTime();
            }

            //从ngavs生产履历表里抽数据
            List<MfgEntityactual> mfgEntityactuals =
                    mfgEntityactualRepository.queryByCreateDate(dateTime);

            if (mfgEntityactuals == null || mfgEntityactuals.size() == 0) {

                logger.info("未查询到需要做转换处理的数据,OtdEntitynodeactual");
                return;
            }

            logger.info("[制品工序周期],mfgEntityactuals.size={}", mfgEntityactuals.size());

            //记录当前同步的时间戳
            LocalDateTime maxDateTime = mfgEntityactuals.get(mfgEntityactuals.size() - 1).getCreateDate();

            //加载阶段节点TP关系信息
            List<OtdPhaseNodeTpComponent> otdPhaseNodeTpComponents = otdPhaseNodeTpComponentRepository.findAll();

            List<OtdEntitynodeactual> otdEntitynodeactuals = new ArrayList<>();
            for (MfgEntityactual mfgEntityactual : mfgEntityactuals) {

//                logger.info("开始计算[制品节点履历表],entityCode={}", mfgEntityactual.getEntityCode());
                for (OtdPhaseNodeTpComponent otdPhaseNodeTpComponent : otdPhaseNodeTpComponents) {
                    if (otdPhaseNodeTpComponent.getTpcode().equals(mfgEntityactual.getOperationTp())) {

                        OtdEntitynodeactual otdEntitynodeactual = new OtdEntitynodeactual();
                        otdEntitynodeactual.setEntityCode(mfgEntityactual.getEntityCode());
                        otdEntitynodeactual.setCyclephaseCode(otdPhaseNodeTpComponent.getCyclephasecode());
                        otdEntitynodeactual.setCyclenodeCode(otdPhaseNodeTpComponent.getCyclenodecode());
                        otdEntitynodeactual.setTpCode(mfgEntityactual.getOperationTp());
                        otdEntitynodeactual.setDeptCode(mfgEntityactual.getDeptCode());
                        otdEntitynodeactual.setCyclephasenodeType(otdPhaseNodeTpComponent.getCyclephasenodetype());

                        LocalDateTime entityactualActPasstime = mfgEntityactual.getEntityactualActPasstime();
                        String format = entityactualActPasstime.format(DateConstants.dfymd);
                        LocalDate workDate = LocalDate.parse(format, DateConstants.dfymd);

                        otdEntitynodeactual.setCyclenodePasstime(entityactualActPasstime);
                        otdEntitynodeactual.setWorkDate(workDate);

                        otdEntitynodeactual.setCreateDate(LocalDateTime.now());
                        otdEntitynodeactual.setCreateUser("SYSTEM");
//                        otdEntitynodeactualRepository.save(otdEntitynodeactual);
                        otdEntitynodeactuals.add(otdEntitynodeactual);
                        if (CommonConstants.CNST_QUARTZ_PARAM_CONTINUE.equals(param)) {

                            otdCurrentCycleNodeService.analyzeToCurrentCycleNode(mfgEntityactual, otdPhaseNodeTpComponent, param);
                        }
                        break;
                    }
                }

            }

            batchService.batchSave(otdEntitynodeactuals);

            brSyncTimestamp.setSyncTime(maxDateTime);
            brSyncTimestampRepository.save(brSyncTimestamp);
            LocalDateTime endTime = LocalDateTime.now();
            logger.info("[制品节点履历表]计算完成,time={},耗时={}", endTime, Duration.between(startTime, endTime).getSeconds());
        } catch (Exception e) {
            logger.error("发生系统异常", e);
        }
    }

    public void analyzeToEntityNodeActual(MfgEntityactual mfgEntityactual, OtdPhaseNodeTpComponent otdPhaseNodeTpComponent, String param) throws Exception {

        OtdEntitynodeactual otdEntitynodeactual = new OtdEntitynodeactual();
        otdEntitynodeactual.setEntityCode(mfgEntityactual.getEntityCode());
        otdEntitynodeactual.setCyclephaseCode(otdPhaseNodeTpComponent.getCyclephasecode());
        otdEntitynodeactual.setCyclenodeCode(otdPhaseNodeTpComponent.getCyclenodecode());
        otdEntitynodeactual.setTpCode(mfgEntityactual.getOperationTp());
        otdEntitynodeactual.setDeptCode(mfgEntityactual.getDeptCode());
        otdEntitynodeactual.setCyclephasenodeType(otdPhaseNodeTpComponent.getCyclephasenodetype());

        LocalDateTime entityactualActPasstime = mfgEntityactual.getEntityactualActPasstime();
        String format = entityactualActPasstime.format(DateConstants.dfymd);
        LocalDate workDate = LocalDate.parse(format, DateConstants.dfymd);

        otdEntitynodeactual.setCyclenodePasstime(entityactualActPasstime);
        otdEntitynodeactual.setWorkDate(workDate);

        otdEntitynodeactual.setCreateDate(LocalDateTime.now());
        otdEntitynodeactual.setCreateUser("SYSTEM");
        otdEntitynodeactualRepository.save(otdEntitynodeactual);

        if (CommonConstants.CNST_QUARTZ_PARAM_CONTINUE.equals(param)) {

            otdCurrentCycleNodeService.analyzeToCurrentCycleNode(mfgEntityactual, otdPhaseNodeTpComponent, param);
        }


    }
}
