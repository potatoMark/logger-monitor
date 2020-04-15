package com.numi.io.quartz.controllers;

import com.numi.io.quartz.task.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    OperaionCycleService operaionCycleService;

    @Autowired
    OtdEntityCycleWithManufactureService otdEntityCycleWithManufactureService;

    @Autowired
    OtdEntitynodeactualService otdEntitynodeactualService;

    @Autowired
    OtdCurrentCycleNodeService otdCurrentCycleNodeService;

    @Autowired
    OtdPhaseInventoryDetailService otdPhaseInventoryDetailService;

//    @GetMapping("excute")
//    public void x() {
//        operaionCycleService.transformation();
//    }
//    @GetMapping("manufacture")
//    public void y() {
//        otdEntityCycleWithManufactureService.transformation();
//    }
//    @GetMapping("entitynode")
//    public void z() {
//        otdEntitynodeactualService.transformation();
//    }
//
//    @GetMapping("currentCycleNode")
//    public void a() {
//        otdCurrentCycleNodeService.transformation();
//    }
//
//    @GetMapping("inventory")
//    public void b(){
//        otdPhaseInventoryDetailService.transformation();
//    }

}
