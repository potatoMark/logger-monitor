package com.numi.io.services.impl;

import com.numi.io.entities.BrNgavsEntityactual;
import com.numi.io.json.Root;
import com.numi.io.message.Message;
import com.numi.io.repository.MfgManufactureplanentityRepository;
import com.numi.io.repository.TechnologyTpoperationRepository;
import com.numi.io.services.IoValidateService;
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

    public static NgavsValidateService _;

    @Autowired
    MfgManufactureplanentityRepository mfgManufactureplanentityRepository;

    @Autowired
    TechnologyTpoperationRepository technologyTpoperationRepository;

    @PostConstruct
    public void init() {
        _ = this;
    }

    @Override
    public void validate(Message message, Root json) throws Exception {

        List<Object> tableEntityList = message.getTableEntityList();

        int row = 1;
        for (Object obj : tableEntityList) {
            BrNgavsEntityactual brNgavsEntityactual = (BrNgavsEntityactual) obj;
            //根据VIN查询工艺
            Map<String, String> map = _.
                    mfgManufactureplanentityRepository.
                    queryTechnologyByEntityCode(brNgavsEntityactual.getVin());
            logger.info("map={}", map.get("technologyCode"));

            if (StringUtils.isEmpty(map.get("technologyCode"))) {
                message.setResult(false);
                message.setMessage("未能在OTD系统中查询到对应VIN的工艺代码,VIN={},第{}条数据", brNgavsEntityactual.getVin(), row);
                return;
            }
            //根据工艺查询TP/工序等信息
            Map<String, String> operationMap = _.
                    technologyTpoperationRepository.
                    queryOperationByTechnologyCodeAndTpCode(map.get("technologyCode"), brNgavsEntityactual.getStation());

            if (StringUtils.isEmpty(operationMap.get("technologyoperationCode"))) {
                message.setResult(false);
                message.setMessage("工艺基础数据不全,technologyoperationCode未找到,工艺编码={},tp代码={},第{}条数据", map.get("technologyCode"), brNgavsEntityactual.getStation(), row);
                return;
            }
            if (StringUtils.isEmpty(operationMap.get("technologyCode"))) {
                message.setResult(false);
                message.setMessage("工艺基础数据不全,technologyCode未找到,工艺编码={},tp代码={},第{}条数据", map.get("technologyCode"), brNgavsEntityactual.getStation(), row);
                return;
            }
            if (StringUtils.isEmpty(operationMap.get("operationCode"))) {
                message.setResult(false);
                message.setMessage("工艺基础数据不全,operationCode未找到,工艺编码={},tp代码={},第{}条数据", map.get("technologyCode"), brNgavsEntityactual.getStation(), row);
                return;
            }
            if (StringUtils.isEmpty(operationMap.get("tpCode"))) {
                message.setResult(false);
                message.setMessage("工艺基础数据不全,tpCode未找到,工艺编码={},tp代码={}", map.get("technologyCode"), brNgavsEntityactual.getStation());
                return;
            }
            if (StringUtils.isEmpty(operationMap.get("tpType"))) {
                message.setResult(false);
                message.setMessage("工艺基础数据不全,tpType未找到,工艺编码={},tp代码={}", map.get("technologyCode"), brNgavsEntityactual.getStation());
                return;
            }
            row++;
        }


    }
}
