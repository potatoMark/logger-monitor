package com.numi.io.common.repository;

import com.numi.io.common.entities.BrBoundarymanage;
import com.numi.io.common.entities.DeliveryEntitydeliveryactual;
import com.numi.io.common.entities.DeliveryLogisticsactual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Transactional
@Repository
public interface DeliveryLogisticsactualRepository extends JpaRepository<DeliveryLogisticsactual, Integer> {

    @Query(value="SELECT * FROM delivery_logisticsactual where create_date > ?1 order by create_date asc",nativeQuery = true)
    List<DeliveryLogisticsactual> queryByCreateDate(LocalDateTime date);
}
