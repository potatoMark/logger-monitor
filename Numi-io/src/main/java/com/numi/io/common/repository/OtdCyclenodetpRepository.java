package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Transactional
@Repository
public interface OtdCyclenodetpRepository extends JpaRepository<BrNgavsEntityactual, Integer> {



    @Query(value="select ocp.cyclephase_code cyclephaseCode, ocp.cyclenode_code cyclenodeCode, ocp.cyclephasenode_type cyclephasenodeType " +
            " from otd_cyclenodetp ocn,otd_cyclephasenode ocp " +
            " where ocn.cyclenode_code = ocp.cyclenode_code and ocn.tp_code = ?1 ",nativeQuery = true)
    Map<String,String> queryPhaseCodeAndNodeCodeAndCyclephasenodeTypeByTpCode(String typeCode);


    @Query(value = "SELECT cyclephase_code cyclePhaseCode, dept_code deptCode FROM otd_cyclenodetp group by cyclephase_code,dept_code",nativeQuery = true)
    List<Map<String,String>> queryDeptCodeAndPhaseCode();
}
