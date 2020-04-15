package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OtdPhasepassrank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Repository
public interface OtdPhasepassrankRepository extends JpaRepository<OtdPhasepassrank, Integer> {

    @Modifying
    @Query(value = "delete from otd_phasepassrank where otd_workdate >= ?1 ",nativeQuery = true)
    void deleteWorkDate(LocalDate localDate);
}
