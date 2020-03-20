package com.numi.io.repository;

import com.numi.io.entities.BrNgavsEntityactual;
import com.numi.io.entities.MfgManufactureplanentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Map;

@Transactional
@Repository
public interface MfgManufactureplanentityRepository extends JpaRepository<MfgManufactureplanentity, Integer> {


    @Query(value = "select mmp.technology_code technologyCode " +
            "from mfg_manufactureplanentity mme, mfg_manufactureplan mmp " +
            "where mme.manufactureplan_code = mmp.manufactureplan_code and mme.entity_code = ?1 limit 1", nativeQuery = true)
    Map<String, String> queryTechnologyByEntityCode(String entityCode);
}
