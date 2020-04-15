package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OtdCurrentcyclenode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Transactional
@Repository
public interface OtdCurrentcyclenodeRepository extends JpaRepository<OtdCurrentcyclenode, Integer> {


    OtdCurrentcyclenode findByEntityCode(String entityCode);

    @Query(value="select * from otd_currentcyclenode where scan_time <= ?1",nativeQuery = true)
    List<OtdCurrentcyclenode> queryAllByCreateDate(LocalDateTime localDateTime);
}
