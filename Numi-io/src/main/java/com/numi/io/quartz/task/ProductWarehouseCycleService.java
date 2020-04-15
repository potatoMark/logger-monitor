package com.numi.io.quartz.task;

import com.numi.io.common.constants.CommonConstants;
import com.numi.io.common.constants.DateConstants;
import com.numi.io.common.entities.BrSyncTimestamp;
import com.numi.io.common.entities.OrgWarehousetp;
import com.numi.io.common.entities.StockProductwarehouseactual;
import com.numi.io.common.entities.StockProductwarehousecycle;
import com.numi.io.common.repository.BrSyncTimestampRepository;
import com.numi.io.common.repository.OrgWarehousetpRepository;
import com.numi.io.common.repository.StockProductwarehouseactualRepository;
import com.numi.io.common.repository.StockProductwarehousecycleRepository;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Service
@DisallowConcurrentExecution
public class ProductWarehouseCycleService implements Job {

    private static final Logger logger = LoggerFactory.getLogger(ProductWarehouseCycleService.class);


    @Autowired
    BrSyncTimestampRepository brSyncTimestampRepository;

    @Autowired
    StockProductwarehouseactualRepository stockProductwarehouseactualRepository;

    @Autowired
    StockProductwarehousecycleRepository stockProductwarehousecycleRepository;

    @Autowired
    OrgWarehousetpRepository orgWarehousetpRepository;

    @Transactional(rollbackOn = {Exception.class})
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        try {
            //根据时间戳查询数据
            BrSyncTimestamp brSyncTimestamp = brSyncTimestampRepository.findByCode("productWarehouseCycle");

            LocalDateTime dateTime = null;
            if (brSyncTimestamp == null || brSyncTimestamp.getSyncTime() == null) {
                dateTime = LocalDateTime.parse("1970-01-01 00:00:00", DateConstants.df);
                brSyncTimestamp = new BrSyncTimestamp();
                brSyncTimestamp.setCode("productWarehouseCycle");
            } else {
                dateTime = brSyncTimestamp.getSyncTime();
            }
            //从stock履历表里抽数据
            List<StockProductwarehouseactual> stockProductwarehouseactuals =
                    stockProductwarehouseactualRepository.queryByCreateDate(dateTime);


            if (stockProductwarehouseactuals == null || stockProductwarehouseactuals.size() == 0) {

                logger.info("未查询到需要做转换处理的数据,productWarehouseCycle");
                return;
            }

            //记录当前同步的时间戳
            LocalDateTime maxDateTime = stockProductwarehouseactuals.get(stockProductwarehouseactuals.size() - 1).getCreateDate();

            for (StockProductwarehouseactual stockProductwarehouseactual : stockProductwarehouseactuals) {
                //
                StockProductwarehousecycle stockProductwarehousecycle =
                        stockProductwarehousecycleRepository.findByEntityCode(stockProductwarehouseactual.getEntityCode());


                if (stockProductwarehousecycle == null || stockProductwarehousecycle.getId() == null) {
                    stockProductwarehousecycle = new StockProductwarehousecycle();

                    // TODO
//                    stockProductwarehousecycle.setCatalogmodelCode(mfgEntityactual.getCatalogmodelCode());
//                    stockProductwarehousecycle.setCatalogoptionCode(mfgEntityactual.getCatalogoptionCode());
//                    stockProductwarehousecycle.setCatalogcolorCode(mfgEntityactual.getCatalogcolorCode());
//                    stockProductwarehousecycle.setProductCode(mfgEntityactual.getProductCode());
                    stockProductwarehousecycle.setEntityCode(stockProductwarehouseactual.getEntityCode());

                    stockProductwarehousecycle.setWarehouseCode(stockProductwarehouseactual.getWarehouseCode());
                    // TODO 经销商编码
//                    stockProductwarehousecycle.setDealerCode();
                    stockProductwarehousecycle.setCreateDate(LocalDateTime.now());
                    stockProductwarehousecycle.setCreateUser("SYSTEM");
                }
                //根据TP找工序段和TP类型
                OrgWarehousetp orgWarehousetp = orgWarehousetpRepository.
                        findByTpCode(stockProductwarehouseactual.getProductwarehouseTpcode());

                if (orgWarehousetp == null) {
                    logger.error("当前制品生产履历的工序TP信息在系统中不存在,TP={}", stockProductwarehouseactual.getProductwarehouseTpcode());
                    continue;
                }
                stockProductwarehousecycle.setProductwarehouseareaCode(orgWarehousetp.getWarehouseareaCode());
                stockProductwarehousecycle.setUpdateDate(LocalDateTime.now());
                stockProductwarehousecycle.setUpdateUser("SYSTEM");
                //进入
                if (CommonConstants.CNST_WH_TP_TYPE_0.equals(orgWarehousetp.getTpType())) {


                    stockProductwarehousecycle.setProductwarehouseIntime(stockProductwarehouseactual.getProductwarehousePasstime());
                    stockProductwarehousecycle.setProductwarehouseTpin(orgWarehousetp.getTpCode());

                } else if (CommonConstants.CNST_WH_TP_TYPE_2.equals(orgWarehousetp.getTpType())) {
                    //出
                    stockProductwarehousecycle.setProductwarehouseOuttime(stockProductwarehouseactual.getProductwarehousePasstime());
                    stockProductwarehousecycle.setProductwarehouseTpout(orgWarehousetp.getTpCode());
                }

                //in out 均有值后计算差值
                if (stockProductwarehousecycle.getProductwarehouseTpin() != null
                        && stockProductwarehousecycle.getProductwarehouseTpout() != null) {

                    Duration between = Duration.between
                            (stockProductwarehousecycle.getProductwarehouseIntime(),
                                    stockProductwarehousecycle.getProductwarehouseOuttime());

                    stockProductwarehousecycle.setProductstockCycle(new BigDecimal(between.getSeconds()));
                    stockProductwarehousecycle.setProductstockStaytime(new BigDecimal(between.getSeconds()));
                    // TODO
                    stockProductwarehousecycle.setProductstockStaystandtime(new BigDecimal("0"));

                } else if (stockProductwarehousecycle.getProductwarehouseTpin() != null
                        && stockProductwarehousecycle.getProductwarehouseTpout() == null) {
                    Duration between = Duration.between
                            (stockProductwarehousecycle.getProductwarehouseIntime(),
                                    LocalDateTime.now());
                    stockProductwarehousecycle.setProductstockCycle(new BigDecimal(0));
                    stockProductwarehousecycle.setProductstockStaytime(new BigDecimal(between.getSeconds()));
                }

                stockProductwarehousecycleRepository.save(stockProductwarehousecycle);
            }
            //修改同步时间
            brSyncTimestamp.setSyncTime(maxDateTime);
            brSyncTimestampRepository.save(brSyncTimestamp);

        } catch (Exception e) {
            logger.error("发生系统异常", e);
        }


    }
}
