package com.numi.io.repository;

import com.numi.io.entities.MfgEntityoperationcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface MfgEntityoperationcycleRepository extends JpaRepository<MfgEntityoperationcycle, Integer> {

    MfgEntityoperationcycle findByEntityCode(String entityCode);
}
