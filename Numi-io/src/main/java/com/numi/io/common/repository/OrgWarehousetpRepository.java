package com.numi.io.common.repository;

import com.numi.io.common.entities.OrgWarehousetp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface OrgWarehousetpRepository extends JpaRepository<OrgWarehousetp, Integer> {

    OrgWarehousetp findByTpCode(String tpCode);

}
