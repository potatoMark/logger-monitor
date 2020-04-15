package com.numi.io.quartz.task;
import java.math.BigDecimal;

import com.numi.io.common.constants.CommonConstants;
import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.OtdCurrentcyclenode;
import com.numi.io.common.entities.OtdPhaseinventorydetail;
import com.numi.io.common.entities.OtdPhaseinventoryrank;
import com.numi.io.common.entities.OtdPhasepassrank;
import com.numi.io.common.repository.*;
import com.numi.io.quartz.utils.QuartzUtils;
import org.apache.commons.lang3.StringUtils;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@DisallowConcurrentExecution
public class OtdPhaseInventoryRankService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OtdPhaseInventoryRankService.class);

    @Autowired
    OtdPhaseinventoryrankRepository otdPhaseinventoryrankRepository;

    @Autowired
    OtdPhaserankviewRepository otdPhaserankviewRepository;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String param = QuartzUtils.getJobParam(jobDataMap);
        calc(param);


    }

    public void calc(String param) {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            logger.info("开始计算[OTD在库Rank统计],time={}",startTime);


            //设定需要计算的日期
            LocalDate now = LocalDate.now();
            LocalDate destDate = null;
            if(param.matches("^[0-9]+$")) {

                destDate = now.minusDays(Integer.parseInt(param));
            } else {
                destDate = now;
            }
            //取出所有基础rank标准值
            List<Map<String, String>> standList = otdPhaserankviewRepository.queryStandPhase();

            //清空
            otdPhaseinventoryrankRepository.deleteWorkDate(destDate);
            //查询前30天的所有阶段数据
            List<Map<String,Object>> maps = otdPhaseinventoryrankRepository.queryDetails(destDate);

            logger.info("[OTD在库Rank统计],otdCurrentcyclenodes.size={}",maps.size());

            List<OtdPhaseinventoryrank> otdPhaseinventoryranks = new ArrayList<>();

            List<LocalDate> localDates = new ArrayList<>();
            for (Map<String,Object> map : maps) {

                OtdPhaseinventoryrank otdPhaseinventoryrank = new OtdPhaseinventoryrank();
                LocalDate workDate = LocalDate.parse(String.valueOf(map.get("otdWorkDate")), DateConstants.dfymd);
                otdPhaseinventoryrank.setOtdWorkdate(workDate);
                localDates.add(workDate);
                otdPhaseinventoryrank.setCyclephaseCode(String.valueOf(map.get("cyclephaseCode")));
                otdPhaseinventoryrank.setDeptCode(String.valueOf(map.get("deptCode")));
                otdPhaseinventoryrank.setRankCode(String.valueOf(map.get("rankCode")));
                otdPhaseinventoryrank.setRankPasscount(new BigDecimal(String.valueOf(map.get("stockCount")==null?"0":map.get("stockCount"))));
                otdPhaseinventoryrank.setCyclephaseOverstay(new BigDecimal("0"));
                otdPhaseinventoryrank.setCyclephaseDelay(new BigDecimal("0"));
                otdPhaseinventoryrank.setCreateDate(LocalDateTime.now());
                otdPhaseinventoryrank.setCreateUser("SYSTEM");
                otdPhaseinventoryrank.setUpdateDate(LocalDateTime.now());
                otdPhaseinventoryrank.setUpdateUser("SYSTEM");

                otdPhaseinventoryrankRepository.save(otdPhaseinventoryrank);
                otdPhaseinventoryranks.add(otdPhaseinventoryrank);

            }

            for (LocalDate date : localDates) {
                for (Map<String, String> map : standList) {
                    boolean flg  = false;
                    for (OtdPhaseinventoryrank otdPhaseinventoryrank : otdPhaseinventoryranks) {
                        if(otdPhaseinventoryrank.getDeptCode().equals(map.get("deptCode"))
                                && otdPhaseinventoryrank.getCyclephaseCode().equals(map.get("cyclePhaseCode"))
                                && otdPhaseinventoryrank.getRankCode().equals(map.get("cyclePhaseRankCode"))
                        ) {
                            flg = true;
                            break;

                        }
                    }
                    if (!flg) {
                        OtdPhaseinventoryrank otdPhaseinventoryrank = new OtdPhaseinventoryrank();
                        otdPhaseinventoryrank.setOtdWorkdate(date);
                        otdPhaseinventoryrank.setCyclephaseCode(map.get("cyclePhaseCode"));
                        otdPhaseinventoryrank.setDeptCode(map.get("deptCode"));
                        otdPhaseinventoryrank.setRankCode(map.get("cyclePhaseRankCode"));
                        otdPhaseinventoryrank.setRankPasscount(new BigDecimal(0));
                        otdPhaseinventoryrank.setCyclephaseOverstay(new BigDecimal("0"));
                        otdPhaseinventoryrank.setCyclephaseDelay(new BigDecimal("0"));
                        otdPhaseinventoryrank.setCreateDate(LocalDateTime.now());
                        otdPhaseinventoryrank.setCreateUser("SYSTEM");
                        otdPhaseinventoryrank.setUpdateDate(LocalDateTime.now());
                        otdPhaseinventoryrank.setUpdateUser("SYSTEM");

                        otdPhaseinventoryrankRepository.save(otdPhaseinventoryrank);
                    }

                }
            }


            LocalDateTime endTime = LocalDateTime.now();
            logger.info("[OTD在库Rank统计]计算完成,time={},耗时={}",endTime, Duration.between(startTime,endTime).getSeconds());
        } catch (Exception e) {
            logger.error("发生系统异常", e);
            logger.info("[OTD在库Rank统计]异常结束");
        }
    }
}
