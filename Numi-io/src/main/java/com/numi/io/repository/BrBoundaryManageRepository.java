package com.numi.io.repository;

import com.numi.io.entities.BrBoundarymanage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface BrBoundaryManageRepository extends JpaRepository<BrBoundarymanage, Integer> {

    BrBoundarymanage findByCode(String code);
}
