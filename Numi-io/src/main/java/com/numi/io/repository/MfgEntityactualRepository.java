package com.numi.io.repository;

import com.numi.io.entities.BrBoundarymanage;
import com.numi.io.entities.MfgEntityactual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public interface MfgEntityactualRepository extends JpaRepository<MfgEntityactual, Integer> {

    @Query(value="SELECT * FROM mfg_entityactual where create_date > ?1 order by create_date asc",nativeQuery = true)
    List<MfgEntityactual> queryByCreateDate(LocalDateTime date);
}
