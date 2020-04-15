package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OtdPhaserankview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.List;

@Transactional
@Repository
public interface OtdPhaserankviewRepository extends JpaRepository<OtdPhaserankview, Integer> {

    @Query(value="select cyclephase_code cyclephaseCode, rank_code rankCode,dept_code deptCode, work_date workDate, sum(flag) passCount " +
            " from otd_phaserankview where work_date >= ?1 " +
            " group by cyclephase_code,rank_code,dept_code, work_date ",nativeQuery = true)
    List<Map<String, Object>> queryRankGroupByCreateDate(LocalDate localDate);


    @Query(value="select t1.cyclephase_code cyclePhaseCode,t1.dept_code deptCode,t2.cyclephase_rankcode cyclePhaseRankCode from " +
            "(SELECT cyclephase_code,dept_code FROM otd_cyclenodetp group by cyclephase_code,dept_code) t1, " +
            "otd_cyclephaserank t2 " +
            "where t1.cyclephase_code = t2.cyclephase_code ",nativeQuery = true)
    List<Map<String,String>> queryStandPhase();

}
