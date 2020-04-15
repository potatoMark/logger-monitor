package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OtdPhaseinventoryrank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Transactional
@Repository
public interface OtdPhaseinventoryrankRepository extends JpaRepository<OtdPhaseinventoryrank, Integer> {


    @Modifying
    @Query(value = "delete from otd_phaseinventoryrank where otd_workdate >= ?1 ",nativeQuery = true)
    void deleteWorkDate(LocalDate localDate);

    @Query(value = "select t1.dept_code deptCode,t1.cyclephase_code cyclephaseCode,t2.rank_code rankCode,t1.otd_workdate otdWorkDate,count(1) stockCount from otd_phaseinventorydetail t1,otd_entityphasestandrank t2 " +
            " where t1.entity_code = t2.entity_code " +
            " and t1.otd_workdate >= ?1 " +
            " and t1.cyclephase_code = t2.cyclephase_code " +
            " group by t1.dept_code,t1.cyclephase_code,t2.rank_code ,t1.otd_workdate", nativeQuery = true)
    List<Map<String,Object>> queryDetails(LocalDate localDate);
}
