package com.numi.io.common.repository;

import com.numi.io.common.entities.OtdEntitynodeactual;
import com.numi.io.common.entities.OtdPhaseinventorydetail;
import com.sun.javafx.collections.MappingChange;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.List;

@Transactional
@Repository
public interface OtdEntitynodeactualRepository extends JpaRepository<OtdEntitynodeactual, Integer> {

    @Query(value="SELECT * FROM otd_entitynodeactual where create_date > ?1 and cyclephasenode_type = ?2 order by cyclenode_passtime asc",nativeQuery = true)
    List<OtdEntitynodeactual> queryByCreateDateAndCyclephasenodeType(LocalDateTime dateTime, String cyclePhaseType);


    @Query(value="SELECT * FROM otd_entitynodeactual where create_date between ?1 and ?2 and cyclephasenode_type = ?3 order by create_date asc",nativeQuery = true)
    List<OtdEntitynodeactual> queryByCreateDateAndCyclephasenodeTypeByRank(LocalDateTime startTime, LocalDateTime endTime, String cyclePhaseType);

    @Query(value="SELECT cyclephase_code cyclephaseCode,dept_code deptCode, work_date workDate, count(1) count FROM otd_entitynodeactual \n" +
            "where work_date >= ?1 \n" +
            "and cyclephasenode_type= ?2 group by cyclephase_code, dept_code, work_date order by create_date asc ",nativeQuery = true)
    List<Map<String, Object>> queryRankStatistics(LocalDate workDate, String type);

    List<OtdEntitynodeactual> findByWorkDate(LocalDate localDate);

    @Query(value = "select *  from otd_entitynodeactual  where cyclephasenode_type = '0'  and dept_code=?2 and cyclephase_code=?3 and  work_date <=?1  and entity_code\n" +
            "not in( select entity_code from otd_entitynodeactual where  cyclephasenode_type = '1' and work_date <=?1 and dept_code=?2 and cyclephase_code=?3 );",nativeQuery = true)
    List<OtdEntitynodeactual> queryTypeinData(LocalDate localDate,String deptCode, String cyclePhase);


}
