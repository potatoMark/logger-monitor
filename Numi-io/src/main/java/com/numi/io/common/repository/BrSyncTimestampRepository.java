package com.numi.io.common.repository;

import com.numi.io.common.entities.BrSyncTimestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Map;

@Transactional
@Repository
public interface BrSyncTimestampRepository extends JpaRepository<BrSyncTimestamp, Integer> {

    @Query(value="select COALESCE(sync_time,'1970-01-01 00:00:00') syncTime from br_sync_timstamp where code = ?1", nativeQuery = true)
    Map<String,String> queryTimestampByCode(String code);

    BrSyncTimestamp findByCode(String code);
}
