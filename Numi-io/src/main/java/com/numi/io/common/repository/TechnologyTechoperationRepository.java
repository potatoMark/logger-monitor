package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.TechnologyTechoperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TechnologyTechoperationRepository extends JpaRepository<TechnologyTechoperation, Integer> {


    List<TechnologyTechoperation> findByTechnologyCodeAndPlantCode(String technologyCode, String plantCode);
}
