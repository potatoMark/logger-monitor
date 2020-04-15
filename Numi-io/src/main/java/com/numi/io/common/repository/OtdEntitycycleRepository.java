package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OtdEntitycycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Transactional
@Repository
public interface OtdEntitycycleRepository extends JpaRepository<OtdEntitycycle, Integer> {


    @Query(value = "select * from otd_entitycycle where create_date between ?1 and ?2",nativeQuery = true)
    List<OtdEntitycycle> queryByCreateDate(LocalDateTime startTime,LocalDateTime endTime);


    OtdEntitycycle findByEntityCodeAndDeptCodeAndCyclephaseCode(String entity_code, String deptCode,String cyclePhaseCode);
}
