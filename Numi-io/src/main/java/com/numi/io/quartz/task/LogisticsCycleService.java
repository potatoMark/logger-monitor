package com.numi.io.quartz.task;

import com.numi.io.common.constants.CommonConstants;
import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.BrSyncTimestamp;
import com.numi.io.common.entities.DeliveryLogisticsactual;
import com.numi.io.common.entities.DeliveryLogisticscycle;
import com.numi.io.common.entities.DeliverySectiontp;
import com.numi.io.common.repository.BrSyncTimestampRepository;
import com.numi.io.common.repository.DeliveryLogisticsactualRepository;
import com.numi.io.common.repository.DeliveryLogisticscycleRepository;
import com.numi.io.common.repository.DeliverySectiontpRepository;
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
public class LogisticsCycleService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(LogisticsCycleService.class);


    @Autowired
    BrSyncTimestampRepository brSyncTimestampRepository;

    @Autowired
    DeliveryLogisticscycleRepository deliveryLogisticscycleRepository;

    @Autowired
    DeliverySectiontpRepository deliverySectiontpRepository;

    @Autowired
    DeliveryLogisticsactualRepository deliveryLogisticsactualRepository;

    @Transactional(rollbackOn = {Exception.class})
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        try {
            //根据时间戳查询数据
            BrSyncTimestamp brSyncTimestamp = brSyncTimestampRepository.findByCode("logisticsCycle");

            LocalDateTime dateTime = null;
            if (brSyncTimestamp == null || brSyncTimestamp.getSyncTime() == null) {
                dateTime = LocalDateTime.parse("1970-01-01 00:00:00", DateConstants.df);
                brSyncTimestamp = new BrSyncTimestamp();
                brSyncTimestamp.setCode("logisticsCycle");
            } else {
                dateTime = brSyncTimestamp.getSyncTime();
            }
            //从stock履历表里抽数据
            List<DeliveryLogisticsactual> deliveryLogisticsactuals = deliveryLogisticsactualRepository.queryByCreateDate(dateTime);


            if (deliveryLogisticsactuals == null || deliveryLogisticsactuals.size() == 0) {

                logger.info("未查询到需要做转换处理的数据,LogisticsCycleService");
                return;
            }

            //记录当前同步的时间戳
            LocalDateTime maxDateTime = deliveryLogisticsactuals.get(deliveryLogisticsactuals.size() - 1).getCreateDate();

            for (DeliveryLogisticsactual deliveryLogisticsactual : deliveryLogisticsactuals) {
                //

                DeliveryLogisticscycle deliveryLogisticscycle =
                        deliveryLogisticscycleRepository.findByEntityCode(deliveryLogisticsactual.getEntityCode());

                if (deliveryLogisticscycle == null || deliveryLogisticscycle.getId() == null) {
                    deliveryLogisticscycle = new DeliveryLogisticscycle();

                    deliveryLogisticscycle.setEntityCode(deliveryLogisticsactual.getEntityCode());
                    //TODO
//                    deliveryLogisticscycle.setOrderCode("");
                    deliveryLogisticscycle.setRouteCode(deliveryLogisticsactual.getRouteCode());
                    deliveryLogisticscycle.setCreateDate(LocalDateTime.now());
                    deliveryLogisticscycle.setCreateUser("SYSTEM");
                }
                //根据TP找工序段和TP类型
                DeliverySectiontp deliverySectiontp = deliverySectiontpRepository.
                        findByTpCode(deliveryLogisticsactual.getLogisticsactualTpcode());

                if (deliverySectiontp == null) {
                    logger.error("当前制品生产履历的工序TP信息在系统中不存在,TP={}", deliveryLogisticsactual.getLogisticsactualTpcode());
                    continue;
                }
                deliveryLogisticscycle.setSectionCode(deliverySectiontp.getSectionCode());
                deliveryLogisticscycle.setUpdateDate(LocalDateTime.now());
                deliveryLogisticscycle.setUpdateUser("SYSTEM");
                //进入
                if (CommonConstants.CNST_D_TP_TYPE_0.equals(deliverySectiontp.getTpType())) {


                    deliveryLogisticscycle.setLogisticscycleStarttp(deliverySectiontp.getTpCode());
                    deliveryLogisticscycle.setLogisticscycleActstarttime(deliveryLogisticsactual.getLogisticsactualPasstime());

                } else if (CommonConstants.CNST_D_TP_TYPE_1.equals(deliverySectiontp.getTpType())) {
                    //出
                    deliveryLogisticscycle.setLogisticscycleEndtp(deliverySectiontp.getTpCode());
                    deliveryLogisticscycle.setLogisticscycleActendtime(deliveryLogisticsactual.getLogisticsactualPasstime());

                }

                //in out 均有值后计算差值
                if (deliveryLogisticscycle.getLogisticscycleStarttp() != null
                        && deliveryLogisticscycle.getLogisticscycleEndtp() != null) {

                    Duration between = Duration.between
                            (deliveryLogisticscycle.getLogisticscycleActstarttime(),
                                    deliveryLogisticscycle.getLogisticscycleActendtime());

                    deliveryLogisticscycle.setLogisticscycleCycle(new BigDecimal(between.getSeconds()));
                    deliveryLogisticscycle.setLogisticscycleStaytime(new BigDecimal(between.getSeconds()));
                    // TODO
                    deliveryLogisticscycle.setLogisticscycleStaystandtime(new BigDecimal(0));

                } else if (deliveryLogisticscycle.getLogisticscycleStarttp() != null
                        && deliveryLogisticscycle.getLogisticscycleEndtp() == null) {
                    Duration between = Duration.between
                            (deliveryLogisticscycle.getLogisticscycleActstarttime(),
                                    LocalDateTime.now());
                    deliveryLogisticscycle.setLogisticscycleCycle(new BigDecimal(between.getSeconds()));
                    deliveryLogisticscycle.setLogisticscycleStaytime(new BigDecimal(between.getSeconds()));
                }

                deliveryLogisticscycleRepository.save(deliveryLogisticscycle);
            }
            //修改同步时间
            brSyncTimestamp.setSyncTime(maxDateTime);
            brSyncTimestampRepository.save(brSyncTimestamp);

        } catch (Exception e) {
            logger.error("发生系统异常", e);
        }


    }
}
