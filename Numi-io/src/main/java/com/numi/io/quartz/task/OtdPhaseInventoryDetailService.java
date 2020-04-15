package com.numi.io.quartz.task;

import com.numi.io.common.constants.CommonConstants;
import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.*;
import com.numi.io.common.repository.*;
import com.numi.io.quartz.service.BatchService;
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
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@DisallowConcurrentExecution
public class OtdPhaseInventoryDetailService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OtdPhaseInventoryDetailService.class);


    @Autowired
    OtdPhaseinventorydetailRepository otdPhaseinventorydetailRepository;

    @Autowired
    OtdEntitynodeactualRepository otdEntitynodeactualRepository;

    @Autowired
    BatchService batchService;

    @Autowired
    OrgDepartmentRepository orgDepartmentRepository;

    @Autowired
    OtdCyclephaseRepository otdCyclephaseRepository;

    @Autowired
    OtdCyclephaseoperationRepository otdCyclephaseoperationRepository;

    @Autowired
    MfgEntityoperationcycleRepository mfgEntityoperationcycleRepository;


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String param = QuartzUtils.getJobParam(jobDataMap);
        exec(param);


    }

    public void exec(String param) {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            logger.info("开始计算[每日期末在库详细],time={}",startTime);

            LocalDate now = LocalDate.now();
            LocalDate destDate = null;
            if(param.matches("^[0-9]+$")) {

                destDate = now.minusDays(Integer.parseInt(param));
            } else {
                destDate = now;
            }

            List<OrgDepartment> orgDepartments = orgDepartmentRepository.findAll();
            List<OtdCyclephase> otdCyclephases = otdCyclephaseRepository.findAll();


            while(destDate.compareTo(now) <= 0){
                for (OrgDepartment orgDepartment : orgDepartments) {
                    for (OtdCyclephase otdCyclephase : otdCyclephases) {
                        if (destDate.format(DateConstants.dfymd).equals("2019-11-18")) {
                            if (orgDepartment.getDeptCode().equals("2")) {
                                if (otdCyclephase.getCyclephaseCode().equals("exec")) {

                                    System.out.println(1);
                                }
                            }
                        }

                        List<OtdEntitynodeactual> otdEntitynodeactuals = otdEntitynodeactualRepository.
                                queryTypeinData(destDate, orgDepartment.getDeptCode(), otdCyclephase.getCyclephaseCode());

                            for (OtdEntitynodeactual otdEntitynodeactual : otdEntitynodeactuals) {


                                //根据工艺找工序
                                List<OtdCyclephaseoperation> otdCyclephaseoperations = otdCyclephaseoperationRepository
                                        .findByCyclephaseCodeAndDeptCode(otdEntitynodeactual.getCyclephaseCode(), otdEntitynodeactual.getDeptCode());

                                BigDecimal staytime = new BigDecimal(0);

                                for (OtdCyclephaseoperation otdCyclephaseoperation : otdCyclephaseoperations) {
                                    //根据VIN+工艺工序查询制品周期
                                    MfgEntityoperationcycle mfgEntityoperationcycle = mfgEntityoperationcycleRepository.
                                            findByEntityCodeAndOperationCode
                                                    (otdEntitynodeactual.getEntityCode(), otdCyclephaseoperation.getOperationCode());

                                    if (mfgEntityoperationcycle != null) {
                                        staytime = staytime.add(mfgEntityoperationcycle.getOperationactualStaytime() == null ? new BigDecimal(0) : mfgEntityoperationcycle.getOperationactualStaytime());
                                    }
                                }


                                OtdPhaseinventorydetail otdPhaseinventorydetail = new OtdPhaseinventorydetail();
                                otdPhaseinventorydetail.setDeptCode(otdEntitynodeactual.getDeptCode());
                                otdPhaseinventorydetail.setOtdWorkdate(destDate);
                                otdPhaseinventorydetail.setCyclephaseCode(otdEntitynodeactual.getCyclephaseCode());
                                otdPhaseinventorydetail.setEntityCode(otdEntitynodeactual.getEntityCode());
                                otdPhaseinventorydetail.setCycleactStaytime(staytime);
                                otdPhaseinventorydetail.setTpCode(otdEntitynodeactual.getTpCode());
                                otdPhaseinventorydetail.setCreateDate(LocalDateTime.now());
                                otdPhaseinventorydetail.setCreateUser("SYSTEM");
                                otdPhaseinventorydetailRepository.save(otdPhaseinventorydetail);
                            }
                    }
                }
                destDate = destDate.plusDays(1);
            }
            LocalDateTime endTime = LocalDateTime.now();
            logger.info("[每日期末在库详细]计算完成,time={},耗时={}",endTime, Duration.between(startTime,endTime).getSeconds());
        } catch (Exception e) {
            logger.error("发生系统异常", e);
            logger.info("[每日期末在库详细]异常结束");
        }
    }
}
