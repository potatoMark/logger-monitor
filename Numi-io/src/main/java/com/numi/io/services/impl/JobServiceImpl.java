package com.numi.io.services.impl;

import com.numi.io.entities.BrBoundarymanage;
import com.numi.io.repository.BrBoundaryManageRepository;
import com.numi.io.services.IoExcuteService;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class JobServiceImpl implements IoExcuteService {

    private static final Logger logger = LoggerFactory.getLogger(JobServiceImpl.class);

    @Autowired
    BrBoundaryManageRepository brBoundaryManageRepository;

    public static JobServiceImpl jobService;

    @PostConstruct
    public void init() {
        jobService = this;
    }

    public boolean excute(List<Object> tableEntityList){

        BrBoundarymanage byCode = brBoundaryManageRepository.findByCode("");
        logger.info("rst={}",ToStringBuilder.reflectionToString(byCode, ToStringStyle.SHORT_PREFIX_STYLE));
        return true;
    }
}
