package com.numi.io.quartz;

import com.numi.io.common.constants.CommonConstants;
import com.numi.io.quartz.task.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuartzController {

    @Autowired
    OtdEntityCycleWithManufactureService otdEntityCycleWithManufactureService;

    @Autowired
    OtdPhasePassRankService otdPhasePassRankService;

    @Autowired
    OtdPhaseInventoryRankService otdPhaseInventoryRankService;

    @GetMapping("x")
    public void x(){

        otdPhasePassRankService.calc("180");

    }

    @GetMapping("y")
    public void y(){

        otdPhaseInventoryRankService.calc("180");

    }

    @Autowired
    OtdPhasecyclestatisticsService otdPhasecyclestatisticsService;

    @GetMapping("z")
    public void z(){

        otdPhasecyclestatisticsService.calc("180");

    }

    @Autowired
    OtdEntitynodeactualService otdEntitynodeactualService;

    @GetMapping("c")
    public void c(){
        otdEntitynodeactualService.exec("");

    }

    @Autowired
    OtdPhaseInventoryDetailService otdPhaseInventoryDetailService;
    @GetMapping("d")
    public void d(){
        otdPhaseInventoryDetailService.exec("180");

    }

    @GetMapping("e")
    public void e(){
        otdEntityCycleWithManufactureService.exec();

    }

    @Autowired
    OtdCurrentCycleNodeService otdCurrentCycleNodeService;
    @GetMapping("f")
    public void f(){
        otdCurrentCycleNodeService.exec("");

    }

}
