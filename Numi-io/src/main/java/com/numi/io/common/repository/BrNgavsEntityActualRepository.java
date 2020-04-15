package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface BrNgavsEntityActualRepository extends JpaRepository<BrNgavsEntityactual, Integer> {


}
