package com.numi.io.server.services.impl;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OrgSectiontp;
import com.numi.io.common.json.Root;
import com.numi.io.common.message.Message;
import com.numi.io.common.repository.MfgManufactureplanentityRepository;
import com.numi.io.common.repository.OrgSectiontpRepository;
import com.numi.io.common.repository.TechnologyTpoperationRepository;
import com.numi.io.server.services.IoValidateService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
public class NgavsValidateService implements IoValidateService {

    private static final Logger logger = LoggerFactory.getLogger(NgavsValidateService.class);

    public static NgavsValidateService thiz;

    @Autowired
    OrgSectiontpRepository orgSectiontpRepository;

    @PostConstruct
    public void init() {
        thiz = this;
    }

    @Override
    public void validate(Message message, Root json) throws Exception {

        List<Object> tableEntityList = message.getTableEntityList();

        int row = 1;
        for (Object obj : tableEntityList) {
            BrNgavsEntityactual brNgavsEntityactual = (BrNgavsEntityactual) obj;

            List<OrgSectiontp> orgSectiontps = thiz.orgSectiontpRepository.findByTpCode(brNgavsEntityactual.getStation());

            if (orgSectiontps == null || orgSectiontps.size() == 0) {
                message.setResult(false);
                message.setMessage("station在OTD基础数据中未找到,station(TP)代码={}",  brNgavsEntityactual.getStation());
                return;
            }
            row++;
        }


    }
}
