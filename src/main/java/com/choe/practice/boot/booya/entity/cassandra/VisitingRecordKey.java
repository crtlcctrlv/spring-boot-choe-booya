package com.choe.practice.boot.booya.entity.cassandra;

import java.util.Date;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class VisitingRecordKey {

  @PrimaryKeyColumn(name = "userid", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
  private String userid;

  @PrimaryKeyColumn(name = "optime", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
  private Date optime;

  @PrimaryKeyColumn(name = "visitor", ordinal = 2, type = PrimaryKeyType.PARTITIONED)
  private String visitor;

  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public Date getOptime() {
    return optime;
  }

  public void setOptime(Date optime) {
    this.optime = optime;
  }

  public String getVisitor() {
    return visitor;
  }

  public void setVisitor(String visitor) {
    this.visitor = visitor;
  }

}
