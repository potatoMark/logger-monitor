package com.numi.io.quartz.task;

import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.BrSyncTimestamp;
import com.numi.io.common.entities.MfgEntityactual;
import com.numi.io.common.entities.OtdCurrentcyclenode;
import com.numi.io.common.entities.OtdPhaseNodeTpComponent;
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

import javax.transaction.Transactional;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@DisallowConcurrentExecution
public class OtdCurrentCycleNodeService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OtdEntitynodeactualService.class);

    @Autowired
    OtdCyclenodetpRepository otdCyclenodetpRepository;

    @Autowired
    OtdCurrentcyclenodeRepository otdCurrentcyclenodeRepository;

    @Autowired
    BrSyncTimestampRepository brSyncTimestampRepository;

    @Autowired
    MfgEntityactualRepository mfgEntityactualRepository;

    @Autowired
    OtdPhaseNodeTpComponentRepository otdPhaseNodeTpComponentRepository;

    @Autowired
    BatchService batchService;

    @Transactional(rollbackOn = {Exception.class})
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        String param = QuartzUtils.getJobParam(jobExecutionContext.getJobDetail().getJobDataMap());

        exec(param);
    }

    public void exec(String param) {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            logger.info("开始计算[制品当前阶段当前节点],time={}", startTime);
            //根据时间戳查询数据
            BrSyncTimestamp brSyncTimestamp = brSyncTimestampRepository.findByCode("OtdCurrentCycleNode");

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

                logger.info("未查询到需要做转换处理的数据,OtdCurrentCycleNode");
                return;
            }

            logger.info("[制品当前阶段当前节点],mfgEntityactuals.size={}", mfgEntityactuals.size());

            //记录当前同步的时间戳
            LocalDateTime maxDateTime = mfgEntityactuals.get(mfgEntityactuals.size() - 1).getCreateDate();

            //加载阶段节点TP关系信息
            List<OtdPhaseNodeTpComponent> otdPhaseNodeTpComponents = otdPhaseNodeTpComponentRepository.findAll();

            for (MfgEntityactual mfgEntityactual : mfgEntityactuals) {

                for (OtdPhaseNodeTpComponent otdPhaseNodeTpComponent : otdPhaseNodeTpComponents) {

                    if (otdPhaseNodeTpComponent.getTpcode().equals(mfgEntityactual.getOperationTp())) {

                        //当前节点记录表
//                        OtdCurrentcyclenode otdCurrentcyclenode = otdCurrentcyclenodeRepository.findByEntityCode(mfgEntityactual.getEntityCode());
//
//                        if (otdCurrentcyclenode == null) {
//                            otdCurrentcyclenode = new OtdCurrentcyclenode();
//                        }
//                        otdCurrentcyclenode.setEntityCode(mfgEntityactual.getEntityCode());
//                        otdCurrentcyclenode.setCyclephaseCode(otdPhaseNodeTpComponent.getCyclephasecode());
//                        otdCurrentcyclenode.setCyclenodeCode(otdPhaseNodeTpComponent.getCyclenodecode());
//                        otdCurrentcyclenode.setTpCode(mfgEntityactual.getOperationTp());
//                        otdCurrentcyclenode.setCreateDate(LocalDateTime.now());
//                        otdCurrentcyclenode.setCreateUser("SYSTEM");
//
//                        if (otdCurrentcyclenode.getId() != null) {
//                            updateList.add(otdCurrentcyclenode);
//                        } else {
//                            insertList.add(otdCurrentcyclenode);
//                        }
                        analyzeToCurrentCycleNode(mfgEntityactual, otdPhaseNodeTpComponent, param);
                        break;
                    }
                }
            }


            brSyncTimestamp.setSyncTime(maxDateTime);
            brSyncTimestampRepository.save(brSyncTimestamp);
            LocalDateTime endTime = LocalDateTime.now();
            logger.info("[制品当前阶段当前节点]计算完成,time={},耗时={}", endTime, Duration.between(startTime, endTime).getSeconds());
        } catch (Exception e) {
            logger.error("发生系统异常", e);
        }
    }

    public void analyzeToCurrentCycleNode(MfgEntityactual mfgEntityactual, OtdPhaseNodeTpComponent otdPhaseNodeTpComponent, String param) {
        logger.info("开始计算current entity={}",mfgEntityactual.getEntityCode());
        //当前节点记录表
        OtdCurrentcyclenode otdCurrentcyclenode = otdCurrentcyclenodeRepository.findByEntityCode(mfgEntityactual.getEntityCode());

        if (otdCurrentcyclenode == null) {
            otdCurrentcyclenode = new OtdCurrentcyclenode();
        }
        otdCurrentcyclenode.setEntityCode(mfgEntityactual.getEntityCode());
        otdCurrentcyclenode.setCyclephaseCode(otdPhaseNodeTpComponent.getCyclephasecode());
        otdCurrentcyclenode.setCyclenodeCode(otdPhaseNodeTpComponent.getCyclenodecode());
        otdCurrentcyclenode.setScanTime(mfgEntityactual.getEntityactualActPasstime());
        otdCurrentcyclenode.setTpCode(mfgEntityactual.getOperationTp());
        otdCurrentcyclenode.setDeptCode(mfgEntityactual.getDeptCode());
        otdCurrentcyclenode.setCreateDate(LocalDateTime.now());
        otdCurrentcyclenode.setCreateUser("SYSTEM");


        otdCurrentcyclenodeRepository.save(otdCurrentcyclenode);

    }
}
