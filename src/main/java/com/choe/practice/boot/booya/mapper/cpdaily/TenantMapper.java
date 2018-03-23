package com.choe.practice.boot.booya.mapper.cpdaily;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.choe.practice.boot.booya.entity.mysql.Tenant;

@Mapper
public interface TenantMapper {

  @Select("select * from t_cpdaily_tenants where WID = #{wid}")
  @Results({@Result(property = "wid", column = "WID"),
      @Result(property = "tenantName", column = "TENANT_NAME")})
  Tenant findTenantByWid(@Param("wid") String wid);

  @Select("select * from t_cpdaily_tenants where WID in (${wids})")
  @Results({@Result(property = "wid", column = "WID"),
      @Result(property = "tenantName", column = "TENANT_NAME")})
  List<Tenant> findTenantByWids(@Param("wids") String wids);

  @Select("select * from t_cpdaily_tenants where STATUS = 'ENABLE'")
  @Results({@Result(property = "wid", column = "WID"),
      @Result(property = "tenantName", column = "TENANT_NAME")})
  List<Tenant> findActiveTenants();

}
