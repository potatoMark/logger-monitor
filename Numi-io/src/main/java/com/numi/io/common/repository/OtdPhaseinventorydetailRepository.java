package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OtdPhaseinventorydetail;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Transactional
@Repository
public interface OtdPhaseinventorydetailRepository extends JpaRepository<OtdPhaseinventorydetail, Integer> {


    void deleteByOtdWorkdate(LocalDate localDate);

}
