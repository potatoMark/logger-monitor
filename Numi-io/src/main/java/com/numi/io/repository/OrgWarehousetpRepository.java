package com.numi.io.repository;

import com.numi.io.entities.OrgWarehousetp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface OrgWarehousetpRepository extends JpaRepository<OrgWarehousetp, Integer> {

    OrgWarehousetp findByTpCode(String tpCode);

}
