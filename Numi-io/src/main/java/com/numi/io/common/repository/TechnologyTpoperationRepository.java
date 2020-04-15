package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.TechnologyTpoperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Map;

@Transactional
@Repository
public interface TechnologyTpoperationRepository extends JpaRepository<TechnologyTpoperation, Integer> {

    @Query(value="select tto.technologyoperation_code technologyoperationCode, " +
            " tttp.technology_code technologyCode, tttp.operation_code operationCode,tttp.tp_code tpCode,tttp.tp_type tpType " +
            " from technology_tpoperation tttp ,technology_techoperation tto " +
            " where tttp.technology_code = tto.technology_code " +
            " and tto.operation_code = tttp.operation_code " +
            " and tttp.technology_code = ?1 " +
            " and tttp.tp_code = ?2 ",nativeQuery = true)
    Map<String, String> queryOperationByTechnologyCodeAndTpCode(String technologyCode, String tpCode);

    TechnologyTpoperation findByTpCodeAndTechnologyCode(String typeCode, String technologyCode);
}
