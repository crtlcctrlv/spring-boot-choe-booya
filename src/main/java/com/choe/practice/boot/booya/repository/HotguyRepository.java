package com.choe.practice.boot.booya.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.choe.practice.boot.booya.entity.cassandra.Hotguy;

public interface HotguyRepository extends CrudRepository<Hotguy, String> {

  @Query("select * from t_cpdaily_visiting_hot where tenantid = ?0 and day >= ?1 and day <= ?2 allow filtering")
  public List<Hotguy> findByTimeRange(String tenantId, String startTime, String endTime);

}
