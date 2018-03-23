package com.choe.practice.boot.booya.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.choe.practice.boot.booya.entity.cassandra.VisitingRecord;

public interface VisitingRecordRepository extends CrudRepository<VisitingRecord, String> {

  @Query("select * from t_cpdaily_visiting_record_source where opday = ?0 allow filtering")
  public List<VisitingRecord> findByOpday(String opday);

}
