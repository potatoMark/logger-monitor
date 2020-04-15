package com.numi.io.quartz.task;

import java.math.BigDecimal;

import com.numi.io.common.constants.CommonConstants;
import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.*;
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
public class OtdPhasePassRankService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OtdPhasePassRankService.class);

    @Autowired
    OtdEntitynodeactualRepository otdEntitynodeactualRepository;

    @Autowired
    OtdPhasepassrankRepository otdPhasepassrankRepository;


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
            logger.info("开始计算[OTD通过rank统计],time={}", startTime);
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


            //先删除之前计算的
            otdPhasepassrankRepository.deleteWorkDate(destDate);

            //计算节点上的rank统计  根据日期查询计算日上的车辆j节点履历信息
            List<Map<String, Object>> maps = otdEntitynodeactualRepository.
                    queryRankStatistics(destDate , CommonConstants.CNST_TP_TYPE_0);

            List<OtdPhasepassrank> otdPhasepassranks = new ArrayList<>();

            List<LocalDate> localDates = new ArrayList<>();
            for (Map<String, Object> map : maps) {
                OtdPhasepassrank otdPhasepassrank = new OtdPhasepassrank();
                LocalDate workDate = LocalDate.parse(String.valueOf(map.get("workDate")), DateConstants.dfymd);
                localDates.add(workDate);
                otdPhasepassrank.setOtdWorkdate(workDate);
                otdPhasepassrank.setCyclephaseCode(String.valueOf(map.get("cyclephaseCode")));
                otdPhasepassrank.setDeptCode(String.valueOf(map.get("deptCode")));
                otdPhasepassrank.setCyclephaseType(CommonConstants.CNST_TP_TYPE_0);
                otdPhasepassrank.setRankCode("stand");
                otdPhasepassrank.setRankPasscount(new BigDecimal(String.valueOf(map.get("count"))));
                otdPhasepassrank.setCreateDate(LocalDateTime.now());
                otdPhasepassrank.setCreateUser("SYSTEM");
                otdPhasepassrank.setUpdateDate(LocalDateTime.now());
                otdPhasepassrank.setUpdateUser("SYSTEM");
                otdPhasepassrankRepository.save(otdPhasepassrank);
                otdPhasepassranks.add(otdPhasepassrank);
            }

            for (LocalDate date : localDates) {
                for (Map<String, String> map : standList) {
                    boolean flg  = false;
                    for (OtdPhasepassrank otdPhasepassrank : otdPhasepassranks) {
                        if(otdPhasepassrank.getDeptCode().equals(map.get("deptCode"))
                                && otdPhasepassrank.getCyclephaseCode().equals(map.get("cyclePhaseCode"))
                                && otdPhasepassrank.getRankCode().equals(map.get("cyclePhaseRankCode"))
                        ) {
                            flg = true;
                            break;

                        }
                    }
                    if (!flg) {
                        OtdPhasepassrank otdPhasepassrank = new OtdPhasepassrank();
                        otdPhasepassrank.setOtdWorkdate(date);
                        otdPhasepassrank.setCyclephaseCode(map.get("cyclePhaseCode"));
                        otdPhasepassrank.setDeptCode(map.get("deptCode"));
                        otdPhasepassrank.setCyclephaseType(CommonConstants.CNST_TP_TYPE_0);
                        otdPhasepassrank.setRankCode(map.get("cyclePhaseRankCode"));
                        otdPhasepassrank.setRankPasscount(new BigDecimal(0));
                        otdPhasepassrank.setCreateDate(LocalDateTime.now());
                        otdPhasepassrank.setCreateUser("SYSTEM");
                        otdPhasepassrank.setUpdateDate(LocalDateTime.now());
                        otdPhasepassrank.setUpdateUser("SYSTEM");
                        otdPhasepassrankRepository.save(otdPhasepassrank);
                    }

                }
            }




            //计算TYPE=1的rank
            List<LocalDate> localDates1 = new ArrayList<>();

            List<Map<String,Object>> otdPhaserankviews = otdPhaserankviewRepository.queryRankGroupByCreateDate(destDate);
            List<OtdPhasepassrank> otdPhasepassrankouts = new ArrayList<>();
            for (Map<String,Object> m : otdPhaserankviews) {

                String cyclephaseCode = String.valueOf(m.get("cyclephaseCode"));
                String rankCode = String.valueOf(m.get("rankCode"));
                BigDecimal passCount = new BigDecimal(String.valueOf(m.get("passCount")));

                OtdPhasepassrank otdPhasepassrank = new OtdPhasepassrank();

                LocalDate workDate = LocalDate.parse(String.valueOf(m.get("workDate")), DateConstants.dfymd);
                localDates1.add(workDate);
                otdPhasepassrank.setOtdWorkdate(workDate);


                otdPhasepassrank.setCyclephaseCode(cyclephaseCode);
                otdPhasepassrank.setDeptCode(String.valueOf(m.get("deptCode")));
                otdPhasepassrank.setCyclephaseType(CommonConstants.CNST_TP_TYPE_1);
                otdPhasepassrank.setRankCode(rankCode);
                otdPhasepassrank.setRankPasscount(passCount);
                otdPhasepassrank.setCreateDate(LocalDateTime.now());
                otdPhasepassrank.setCreateUser("SYSTEM");
                otdPhasepassrank.setUpdateDate(LocalDateTime.now());
                otdPhasepassrank.setUpdateUser("SYSTEM");
                otdPhasepassrankRepository.save(otdPhasepassrank);
                otdPhasepassrankouts.add(otdPhasepassrank);
            }

            for (LocalDate date : localDates1) {
                for (Map<String, String> map : standList) {
                    boolean flg  = false;
                    for (OtdPhasepassrank otdPhasepassrank : otdPhasepassrankouts) {
                        if(otdPhasepassrank.getDeptCode().equals(map.get("deptCode"))
                                && otdPhasepassrank.getCyclephaseCode().equals(map.get("cyclePhaseCode"))
                                && otdPhasepassrank.getRankCode().equals(map.get("cyclePhaseRankCode"))
                        ) {
                            flg = true;
                            break;

                        }
                    }
                    if (!flg) {
                        OtdPhasepassrank otdPhasepassrank = new OtdPhasepassrank();
                        otdPhasepassrank.setOtdWorkdate(date);
                        otdPhasepassrank.setCyclephaseCode(map.get("cyclePhaseCode"));
                        otdPhasepassrank.setDeptCode(map.get("deptCode"));
                        otdPhasepassrank.setCyclephaseType(CommonConstants.CNST_TP_TYPE_1);
                        otdPhasepassrank.setRankCode(map.get("cyclePhaseRankCode"));
                        otdPhasepassrank.setRankPasscount(new BigDecimal(0));
                        otdPhasepassrank.setCreateDate(LocalDateTime.now());
                        otdPhasepassrank.setCreateUser("SYSTEM");
                        otdPhasepassrank.setUpdateDate(LocalDateTime.now());
                        otdPhasepassrank.setUpdateUser("SYSTEM");
                        otdPhasepassrankRepository.save(otdPhasepassrank);
                    }

                }
            }




            LocalDateTime endTime = LocalDateTime.now();
            logger.info("[OTD通过rank统计]计算完成,time={},耗时={}", endTime, Duration.between(startTime, endTime).getSeconds());
        } catch (Exception e) {
            logger.error("发生系统异常", e);
            logger.info("[OTD通过rank统计]异常结束");
        }
    }
}
