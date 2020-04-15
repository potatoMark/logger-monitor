package com.numi.io.server.services.impl;
import java.time.LocalDateTime;

import com.numi.io.common.entities.BrVmacsMfgplan;
import com.numi.io.common.repository.BrVmacsMfgplanRepository;
import com.numi.io.server.services.IoExcuteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class VmacsIoService implements IoExcuteService {

    private static final Logger logger = LoggerFactory.getLogger(VmacsIoService.class);

    public static VmacsIoService vmacsIoService;

    @Autowired
    BrVmacsMfgplanRepository brVmacsMfgplanRepository;

    private String CNST_PLN_GNERATE = "00";//计划生成

    @PostConstruct
    public void init() {
        vmacsIoService = this;
    }

    public boolean excute(List<Object> tableEntityList) {

        try {
            for (Object o : tableEntityList) {

                BrVmacsMfgplan brVmacsMfgplan = (BrVmacsMfgplan) o;

                if (CNST_PLN_GNERATE.equals(brVmacsMfgplan.getVehicheStatus())) {

                    BrVmacsMfgplan selectData = vmacsIoService.brVmacsMfgplanRepository.findByVin(brVmacsMfgplan.getVin());

                    if (selectData != null && selectData.getId() != null) {
                        selectData.setPlantCode(brVmacsMfgplan.getPlantCode());
                        selectData.setOrderId(brVmacsMfgplan.getOrderId());
                        selectData.setTriggerTime(brVmacsMfgplan.getTriggerTime());
                        selectData.setDmsOrder(brVmacsMfgplan.getDmsOrder());
                        selectData.setAssemblyTime(brVmacsMfgplan.getAssemblyTime());
                        selectData.setPlanCreate(brVmacsMfgplan.getTriggerTime());
                        selectData.setUpdateDate(LocalDateTime.now());
                        selectData.setUpdateSuer("SYSTEM");
                        vmacsIoService.brVmacsMfgplanRepository.save(selectData);
                    } else {
                        brVmacsMfgplan.setPlanCreate(brVmacsMfgplan.getTriggerTime());
                        brVmacsMfgplan.setCreateDate(LocalDateTime.now());
                        brVmacsMfgplan.setCreateUser("SYSTEM");
                        brVmacsMfgplan.setUpdateDate(LocalDateTime.now());
                        brVmacsMfgplan.setUpdateSuer("SYSTEM");

                        vmacsIoService.brVmacsMfgplanRepository.save(brVmacsMfgplan);
                    }
                }
            }
        } catch (Exception e) {
            logger.error("发生系统异常", e);
            return false;
        }

        return true;
    }
}
