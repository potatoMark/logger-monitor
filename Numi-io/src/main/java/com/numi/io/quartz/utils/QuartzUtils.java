package com.numi.io.quartz.utils;

import org.apache.commons.lang3.StringUtils;
import org.quartz.JobDataMap;
import org.quartz.JobKey;
import org.quartz.TriggerKey;

public class QuartzUtils {

    public static JobKey getJobKey(String key, String group) {

        JobKey jobKey = null;


        jobKey = JobKey.jobKey(key, group);

        return jobKey;
    }

    public static JobKey getJobKey(String key) {

        JobKey jobKey = null;

        jobKey = JobKey.jobKey(key);

        return jobKey;
    }

    public static JobDataMap getJobDataMap(String param) {

        JobDataMap jobDataMap = new JobDataMap();

        jobDataMap.put("param", param);
        return jobDataMap;
    }

    public static String getJobParam(JobDataMap jobDataMap){

        return jobDataMap.getString("param");

    }

    public static TriggerKey getTriggerKey(String key) {

        return TriggerKey.triggerKey(key);

    }
}
