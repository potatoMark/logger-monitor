package com.numi.io.repository;

import com.numi.io.entities.StockProductwarehousecycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface StockProductwarehousecycleRepository extends JpaRepository<StockProductwarehousecycle, Integer> {

    StockProductwarehousecycle findByEntityCode(String entityCode);
}
