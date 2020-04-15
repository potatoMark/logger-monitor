package com.numi.io.common.repository;

import com.numi.io.common.entities.MfgEntityoperationcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface MfgEntityoperationcycleRepository extends JpaRepository<MfgEntityoperationcycle, Integer> {

    MfgEntityoperationcycle findByEntityCodeAndOperationCode(String entityCode, String techOperationCode);
}
