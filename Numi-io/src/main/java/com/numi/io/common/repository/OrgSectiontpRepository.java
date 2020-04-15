package com.numi.io.common.repository;

import com.numi.io.common.entities.BrNgavsEntityactual;
import com.numi.io.common.entities.OrgSectiontp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface OrgSectiontpRepository extends JpaRepository<OrgSectiontp, Integer> {

    List<OrgSectiontp> findByTpCode(String tpCode);

}
