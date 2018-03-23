package com.choe.practice.boot.booya.entity.cassandra;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "t_cpdaily_visiting_record_choe")
public class VisitingRecordBak {

  @PrimaryKey
  private VisitingRecordKeyBak visitingRecordKeyBak;

  private String opday;

  private Integer optype;

  private Integer status;

  private String visitdesc;

  public VisitingRecordKeyBak getVisitingRecordKeyBak() {
    return visitingRecordKeyBak;
  }

  public void setVisitingRecordKeyBak(VisitingRecordKeyBak visitingRecordKeyBak) {
    this.visitingRecordKeyBak = visitingRecordKeyBak;
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

  public String getVisitdesc() {
    return visitdesc;
  }

  public void setVisitdesc(String visitdesc) {
    this.visitdesc = visitdesc;
  }

}
