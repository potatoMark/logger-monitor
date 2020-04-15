package com.numi.io.quartz.ru;

import com.numi.io.common.entities.BrSyncTimestamp;
import com.numi.io.quartz.entities.TaskBuilder;
import com.numi.io.quartz.service.QuartzJobService;
import com.numi.io.quartz.utils.QuartzUtils;
import com.numi.io.common.repository.BrSyncTimestampRepository;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.Scheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class RuntimeInitializationExcutor {

    private static final Logger logger = LoggerFactory.getLogger(RuntimeInitializationExcutor.class);

    @Autowired
    private Scheduler scheduler;

    @Autowired
    QuartzJobService quartzJobService;

    @Autowired
    BrSyncTimestampRepository brSyncTimestampRepository;

    private static String JOB_STATUS_RUN = "0";

    private static String JOB_STATUS_PAUSE = "1";


    @PostConstruct
    public void init() {

        try {
            //从数据库抽所有job数据
            List<BrSyncTimestamp> brSyncTimestamps = brSyncTimestampRepository.findAll();

            for (BrSyncTimestamp brSyncTimestamp : brSyncTimestamps) {

                CronTrigger trigger = (CronTrigger)scheduler.getTrigger(QuartzUtils.getTriggerKey(brSyncTimestamp.getCode()));

                if (trigger == null) {
                    Class clazz = Class.forName(brSyncTimestamp.getClassName());
                    TaskBuilder taskBuilder = TaskBuilder.builder()
                            .jobKey(QuartzUtils.getJobKey(brSyncTimestamp.getCode()))
                            .jobClass(clazz)
                            .cronExpression(brSyncTimestamp.getCronExpression())
                            .jobDataMap(QuartzUtils.getJobDataMap(brSyncTimestamp.getParams()))
                            .build();

                    quartzJobService.scheduleJob(taskBuilder);

                } else {
                    CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(brSyncTimestamp.getCronExpression()).withMisfireHandlingInstructionDoNothing();

                    trigger = trigger.getTriggerBuilder().withIdentity(QuartzUtils.getTriggerKey(brSyncTimestamp.getCode()))
                            .withSchedule(scheduleBuilder).build();
                    trigger.getJobDataMap().putAll(QuartzUtils.getJobDataMap(brSyncTimestamp.getParams()));

                    scheduler.rescheduleJob(QuartzUtils.getTriggerKey(brSyncTimestamp.getCode()), trigger);
                }

                if (JOB_STATUS_PAUSE.equals(brSyncTimestamp.getJobStatus())) {
                    quartzJobService.pauseJob(QuartzUtils.getJobKey(brSyncTimestamp.getCode()));
                }
            }
        } catch (Exception e) {
            logger.error("定时器启动失败", e);
        }
    }


}
