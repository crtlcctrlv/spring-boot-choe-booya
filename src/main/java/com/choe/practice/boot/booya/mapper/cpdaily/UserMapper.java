package com.choe.practice.boot.booya.mapper.cpdaily;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.choe.practice.boot.booya.entity.mysql.User;

@Mapper
public interface UserMapper {

  @Select("select * from t_cpdaily_users where wId = #{wid}")
  @Results(@Result(property = "wid", column = "wId"))
  User findUserByWid(@Param("wid") String wid);

  @Select("select * from t_cpdaily_users where wId in (${wids})")
  @Results(@Result(property = "wid", column = "wId"))
  List<User> findUserByWids(@Param("wids") String wids);

}
