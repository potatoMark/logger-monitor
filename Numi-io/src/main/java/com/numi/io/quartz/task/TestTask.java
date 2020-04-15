package com.numi.io.quartz.task;

import com.numi.io.common.repository.BrSyncTimestampRepository;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DisallowConcurrentExecution
@Service
public class TestTask  implements Job {

    private static final Logger logger = LoggerFactory.getLogger(TestTask.class);

    @Autowired
    BrSyncTimestampRepository brSyncTimestampRepository;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        logger.info("进来了");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("出去了");
        logger.info("r={}",brSyncTimestampRepository);
    }
}
