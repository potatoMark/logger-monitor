package com.numi.io.repository;

import com.numi.io.entities.BrNgavsEntityactual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface BrNgavsEntityActualRepository extends JpaRepository<BrNgavsEntityactual, Integer> {


}
