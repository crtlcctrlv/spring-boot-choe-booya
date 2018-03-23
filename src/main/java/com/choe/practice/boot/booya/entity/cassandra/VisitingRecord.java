package com.choe.practice.boot.booya.entity.cassandra;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "t_cpdaily_visiting_records")
public class VisitingRecord {

  @PrimaryKey
  private VisitingRecordKey visitingRecordKey;

  private String opday;

  private Integer optype;

  private Integer status;

  public VisitingRecordKey getVisitingRecordKey() {
    return visitingRecordKey;
  }

  public void setVisitingRecordKey(VisitingRecordKey visitingRecordKey) {
    this.visitingRecordKey = visitingRecordKey;
  }

  public String getOpday() {
    return opday;
  }

  public void setOpday(String opday) {
    this.opday = opday;
  }

  public Integer getOptype() {
    return optype;
  }

  public void setOptype(Integer optype) {
    this.optype = optype;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
