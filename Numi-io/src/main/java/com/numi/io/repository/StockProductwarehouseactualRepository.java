package com.numi.io.repository;

import com.numi.io.entities.BrNgavsEntityactual;
import com.numi.io.entities.MfgEntityactual;
import com.numi.io.entities.StockProductwarehouseactual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Transactional
@Repository
public interface StockProductwarehouseactualRepository extends JpaRepository<StockProductwarehouseactual, Integer> {


    @Query(value="SELECT * FROM stock_productwarehouseactual where create_date > ?1 order by create_date asc",nativeQuery = true)
    List<StockProductwarehouseactual> queryByCreateDate(LocalDateTime date);
}
