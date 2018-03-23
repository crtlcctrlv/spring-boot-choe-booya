package com.choe.practice.boot.booya.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.choe.practice.boot.booya.entity.cassandra.NoticeState;
import com.choe.practice.boot.booya.entity.cassandra.VisitingRecord;

public interface NoticStateRepository extends CrudRepository<NoticeState, String> {

  @Query("update t_cpdaily_user_notice_states set strangerinfo = 0 where userid = ?0")
  public List<VisitingRecord> updateStrangerInfo(String userId);

}
