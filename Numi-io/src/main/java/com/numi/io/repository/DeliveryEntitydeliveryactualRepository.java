package com.numi.io.repository;

import com.numi.io.entities.DeliveryEntitydeliveryactual;
import com.numi.io.entities.MfgEntityactual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Transactional
@Repository
public interface DeliveryEntitydeliveryactualRepository extends JpaRepository<DeliveryEntitydeliveryactual, Integer> {


    @Query(value="SELECT * FROM delivery_entitydeliveryactual where create_date > ?1 order by create_date asc",nativeQuery = true)
    List<DeliveryEntitydeliveryactual> queryByCreateDate(LocalDateTime date);
}
