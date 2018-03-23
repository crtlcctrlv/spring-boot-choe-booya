package com.choe.practice.boot.booya.entity.cassandra;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class HotguyKey {

  @PrimaryKeyColumn(name = "userid", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
  private String userId;

  @PrimaryKeyColumn(name = "tenantid", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
  private String tenantId;

  @PrimaryKeyColumn(name = "day", ordinal = 2, type = PrimaryKeyType.PARTITIONED)
  private String day;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

}
