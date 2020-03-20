package com.numi.io.repository;

import com.numi.io.entities.BrBoundarymanage;
import com.numi.io.entities.DeliveryLogisticscycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface DeliveryLogisticscycleRepository extends JpaRepository<DeliveryLogisticscycle, Integer> {

    DeliveryLogisticscycle findByEntityCode(String entityCode);
}
