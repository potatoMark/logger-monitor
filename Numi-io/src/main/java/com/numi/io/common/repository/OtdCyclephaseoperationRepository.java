package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OtdCyclephaseoperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface OtdCyclephaseoperationRepository extends JpaRepository<OtdCyclephaseoperation, Integer> {


    List<OtdCyclephaseoperation> findByCyclephaseCodeAndDeptCode(String cyclephaseCode,String deptCode);
}
