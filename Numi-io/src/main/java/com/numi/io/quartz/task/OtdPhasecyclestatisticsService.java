package com.numi.io.quartz.task;

import com.numi.io.common.MathUtils;
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

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@DisallowConcurrentExecution
public class OtdPhasecyclestatisticsService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OtdPhasecyclestatisticsService.class);

    @Autowired
    OtdPhasecyclestatisticsRepository otdPhasecyclestatisticsRepository;

    @Autowired
    OtdEntitycycleRepository otdEntitycycleRepository;

    @Autowired
    OtdCyclenodetpRepository otdCyclenodetpRepository;

    @Autowired
    OtdCycletypeinstatisticsviewRepository otdCycletypeinstatisticsviewRepository;

    @Autowired
    OtdCycletypeoutstatisticsviewRepository otdCycletypeoutstatisticsviewRepository;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String param = QuartzUtils.getJobParam(jobDataMap);
        calc(param);


    }

    public void calc(String param) {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            logger.info("开始计算[OTD阶段周期波动],time={}", startTime);
            //设定需要计算的日期
            LocalDate now = LocalDate.now();
            LocalDate destDate = null;
            if(param.matches("^[0-9]+$")) {

                destDate = now.minusDays(Integer.parseInt(param));
            } else {
                destDate = now;
            }

            //取出所有基础rank标准值
            List<Map<String, String>> standList = otdCyclenodetpRepository.queryDeptCodeAndPhaseCode();


            //清空
            otdPhasecyclestatisticsRepository.deleteWorkDate(destDate);



            //计算 type=0的周期
            List<OtdCycletypeinstatisticsview> otdCycletypeinstatisticsviews = otdCycletypeinstatisticsviewRepository.findAll();

            Map<LocalDate, Map<String, Map<String, List<OtdCycletypeinstatisticsview>>>> collect1 = otdCycletypeinstatisticsviews.stream()
                    .collect(Collectors.groupingBy(OtdCycletypeinstatisticsview::getOtdWorkdate, Collectors.groupingBy(OtdCycletypeinstatisticsview::getCyclephaseCode, Collectors.groupingBy(OtdCycletypeinstatisticsview::getDeptCode))));
            List<OtdPhasecyclestatistics> otdPhasecyclestatisticsInArrayList = new ArrayList<OtdPhasecyclestatistics>();

            //工作日
            for (LocalDate workDate : collect1.keySet()) {

                Map<String, Map<String, List<OtdCycletypeinstatisticsview>>> stringMapMap = collect1.get(workDate);

                //阶段
                for (String cyclePhaseCode : stringMapMap.keySet()) {

                    Map<String, List<OtdCycletypeinstatisticsview>> stringListMap = stringMapMap.get(cyclePhaseCode);

                    for (String deptCode : stringListMap.keySet()) {

                        List<OtdCycletypeinstatisticsview> otdCycletypeinstatisticsviews1 = stringListMap.get(deptCode);

                        //四分位计算
                        BigDecimal[] bigDecimals = otdCycletypeinstatisticsviews1.stream().map(OtdCycletypeinstatisticsview::getCycleactStaytime).toArray(BigDecimal[]::new);

                        BigDecimal[] collect = MathUtils.fourDivsion(bigDecimals);
                        //最大最小
                        Arrays.sort(bigDecimals);
                        BigDecimal min = bigDecimals[0];
                        BigDecimal max = bigDecimals[bigDecimals.length - 1];

                        //平均
                        BigDecimal total = new BigDecimal(0);
                        for (BigDecimal bigDecimal : bigDecimals) {
                            total = total.add(bigDecimal);
                        }
                        BigDecimal avg = total.divide(new BigDecimal(bigDecimals.length), 2, BigDecimal.ROUND_HALF_UP);

                        OtdPhasecyclestatistics otdPhasecyclestatistics = new OtdPhasecyclestatistics();
                        otdPhasecyclestatistics.setOtdWorkdate(workDate);
                        otdPhasecyclestatistics.setCyclephaseCode(cyclePhaseCode);
                        otdPhasecyclestatistics.setDeptCode(deptCode);
                        otdPhasecyclestatistics.setCyclephaseType("0");
                        otdPhasecyclestatistics.setPhasecycleMin(min);
                        otdPhasecyclestatistics.setPhasecycle1q(collect[0]);
                        otdPhasecyclestatistics.setPhasecycle2q(collect[1]);
                        otdPhasecyclestatistics.setPhasecycle3q(collect[2]);
                        otdPhasecyclestatistics.setPhasecycleAve(avg);
                        otdPhasecyclestatistics.setPhasecycleMax(max);
                        otdPhasecyclestatistics.setPhasecycleVolatility(new BigDecimal("0"));
                        otdPhasecyclestatistics.setCreateDate(LocalDateTime.now());
                        otdPhasecyclestatistics.setCreateUser("SYSTEM");
                        otdPhasecyclestatistics.setUpdateDate(LocalDateTime.now());
                        otdPhasecyclestatistics.setUpdateUser("SYSTEM");

                        otdPhasecyclestatisticsRepository.save(otdPhasecyclestatistics);
                        otdPhasecyclestatisticsInArrayList.add(otdPhasecyclestatistics);
                    }
                }
            }


            //

            for (LocalDate otdWorkDate : collect1.keySet()) {

                for (Map<String, String> map : standList) {
                    boolean flg  = false;
                    for (OtdPhasecyclestatistics otdPhasecyclestatistics : otdPhasecyclestatisticsInArrayList) {
                        if(otdPhasecyclestatistics.getDeptCode().equals(map.get("deptCode"))
                                && otdPhasecyclestatistics.getCyclephaseCode().equals(map.get("cyclePhaseCode"))
                                && otdPhasecyclestatistics.getOtdWorkdate().equals(otdWorkDate)
                        ) {
                            flg = true;
                            break;

                        }
                    }
                    if (!flg) {
                        OtdPhasecyclestatistics otdPhasecyclestatistics = new OtdPhasecyclestatistics();
                        otdPhasecyclestatistics.setOtdWorkdate(otdWorkDate);
                        otdPhasecyclestatistics.setCyclephaseCode(map.get("cyclePhaseCode"));
                        otdPhasecyclestatistics.setDeptCode(map.get("deptCode"));
                        otdPhasecyclestatistics.setCyclephaseType("0");
                        otdPhasecyclestatistics.setPhasecycleMin(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycle1q(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycle2q(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycle3q(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycleAve(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycleMax(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycleVolatility(new BigDecimal("0"));
                        otdPhasecyclestatistics.setCreateDate(LocalDateTime.now());
                        otdPhasecyclestatistics.setCreateUser("SYSTEM");
                        otdPhasecyclestatistics.setUpdateDate(LocalDateTime.now());
                        otdPhasecyclestatistics.setUpdateUser("SYSTEM");

                        otdPhasecyclestatisticsRepository.save(otdPhasecyclestatistics);
                    }

                }
            }

            //计算周期1的数据
            List<OtdCycletypeoutstatisticsview> otdCycletypeoutstatisticsviews = otdCycletypeoutstatisticsviewRepository.findAll();
            Map<LocalDate, Map<String, Map<String, List<OtdCycletypeoutstatisticsview>>>> collectOut = otdCycletypeoutstatisticsviews.stream()
                    .collect(Collectors.groupingBy(OtdCycletypeoutstatisticsview::getWorkDate, Collectors.groupingBy(OtdCycletypeoutstatisticsview::getCyclephaseCode, Collectors.groupingBy(OtdCycletypeoutstatisticsview::getDeptCode))));
            List<OtdPhasecyclestatistics> otdPhasecyclestatisticsOutArrayList = new ArrayList<OtdPhasecyclestatistics>();

            //工作日
            for (LocalDate workDate : collectOut.keySet()) {

                Map<String, Map<String, List<OtdCycletypeoutstatisticsview>>> stringMapMap = collectOut.get(workDate);

                //阶段
                for (String cyclePhaseCode : stringMapMap.keySet()) {

                    Map<String, List<OtdCycletypeoutstatisticsview>> stringListMap = stringMapMap.get(cyclePhaseCode);

                    for (String deptCode : stringListMap.keySet()) {

                        List<OtdCycletypeoutstatisticsview> otdCycletypeoutstatisticsviews1 = stringListMap.get(deptCode);

                        //四分位计算
                        BigDecimal[] bigDecimals = otdCycletypeoutstatisticsviews1.stream().map(OtdCycletypeoutstatisticsview::getCycleactCycletime).toArray(BigDecimal[]::new);

                        BigDecimal[] collect = MathUtils.fourDivsion(bigDecimals);
                        //最大最小
                        Arrays.sort(bigDecimals);
                        BigDecimal min = bigDecimals[0];
                        BigDecimal max = bigDecimals[bigDecimals.length - 1];

                        //平均
                        BigDecimal total = new BigDecimal(0);
                        for (BigDecimal bigDecimal : bigDecimals) {
                            total = total.add(bigDecimal);
                        }
                        BigDecimal avg = total.divide(new BigDecimal(bigDecimals.length), 2, BigDecimal.ROUND_HALF_UP);

                        OtdPhasecyclestatistics otdPhasecyclestatistics = new OtdPhasecyclestatistics();
                        otdPhasecyclestatistics.setOtdWorkdate(workDate);
                        otdPhasecyclestatistics.setCyclephaseCode(cyclePhaseCode);
                        otdPhasecyclestatistics.setDeptCode(deptCode);
                        otdPhasecyclestatistics.setCyclephaseType("1");
                        otdPhasecyclestatistics.setPhasecycleMin(min);
                        otdPhasecyclestatistics.setPhasecycle1q(collect[0]);
                        otdPhasecyclestatistics.setPhasecycle2q(collect[1]);
                        otdPhasecyclestatistics.setPhasecycle3q(collect[2]);
                        otdPhasecyclestatistics.setPhasecycleAve(avg);
                        otdPhasecyclestatistics.setPhasecycleMax(max);
                        otdPhasecyclestatistics.setPhasecycleVolatility(new BigDecimal("0"));
                        otdPhasecyclestatistics.setCreateDate(LocalDateTime.now());
                        otdPhasecyclestatistics.setCreateUser("SYSTEM");
                        otdPhasecyclestatistics.setUpdateDate(LocalDateTime.now());
                        otdPhasecyclestatistics.setUpdateUser("SYSTEM");

                        otdPhasecyclestatisticsRepository.save(otdPhasecyclestatistics);
                        otdPhasecyclestatisticsOutArrayList.add(otdPhasecyclestatistics);
                    }
                }
            }


            //

            for (LocalDate otdWorkDate : collectOut.keySet()) {

                for (Map<String, String> map : standList) {
                    boolean flg  = false;
                    for (OtdPhasecyclestatistics otdPhasecyclestatistics : otdPhasecyclestatisticsOutArrayList) {
                        if(otdPhasecyclestatistics.getDeptCode().equals(map.get("deptCode"))
                                && otdPhasecyclestatistics.getCyclephaseCode().equals(map.get("cyclePhaseCode"))
                                && otdPhasecyclestatistics.getOtdWorkdate().equals(otdWorkDate)
                        ) {
                            flg = true;
                            break;

                        }
                    }
                    if (!flg) {
                        OtdPhasecyclestatistics otdPhasecyclestatistics = new OtdPhasecyclestatistics();
                        otdPhasecyclestatistics.setOtdWorkdate(otdWorkDate);
                        otdPhasecyclestatistics.setCyclephaseCode(map.get("cyclePhaseCode"));
                        otdPhasecyclestatistics.setDeptCode(map.get("deptCode"));
                        otdPhasecyclestatistics.setCyclephaseType("1");
                        otdPhasecyclestatistics.setPhasecycleMin(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycle1q(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycle2q(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycle3q(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycleAve(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycleMax(new BigDecimal(0));
                        otdPhasecyclestatistics.setPhasecycleVolatility(new BigDecimal("0"));
                        otdPhasecyclestatistics.setCreateDate(LocalDateTime.now());
                        otdPhasecyclestatistics.setCreateUser("SYSTEM");
                        otdPhasecyclestatistics.setUpdateDate(LocalDateTime.now());
                        otdPhasecyclestatistics.setUpdateUser("SYSTEM");

                        otdPhasecyclestatisticsRepository.save(otdPhasecyclestatistics);
                    }

                }
            }


            LocalDateTime endTime = LocalDateTime.now();
            logger.info("[OTD阶段周期波动]计算完成,time={},耗时={}", endTime, Duration.between(startTime, endTime).getSeconds());
        } catch (Exception e) {
            logger.error("发生系统异常", e);
            logger.info("[OTD阶段周期波动]异常结束");
        }
    }
}
