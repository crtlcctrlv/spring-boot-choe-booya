package com.choe.practice.boot.booya.mapper.stu;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StuMainMapper {

  @Select("select dept_wid from t_coun_stu_main_${schoolId} where user_wid = #{userWid}")
  String affairUserWids(@Param("schoolId") String schoolId, @Param("userWid") Long userWid);

}
