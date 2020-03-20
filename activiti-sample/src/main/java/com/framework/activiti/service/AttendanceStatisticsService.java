package com.framework.activiti.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttendanceStatisticsService implements JavaDelegate {

    private static final Logger logger = LoggerFactory.getLogger(AttendanceStatisticsService.class);

    @Override
    public void execute(DelegateExecution execution) {
        logger.info("开始了ServiceTask");
    }
}
