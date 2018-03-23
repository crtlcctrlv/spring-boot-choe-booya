package com.choe.practice.boot.booya.mapper.leave;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.choe.practice.boot.booya.entity.mysql.LeaveAffair;

@Mapper
public interface LeaveAffairMapper {

  @Select("select * from t_coun_leave_affair where dept_wid = ''")
  @Results({@Result(property = "leaveId", column = "leave_id"),
      @Result(property = "schoolId", column = "school_id"),
      @Result(property = "affairId", column = "affair_id")})
  List<LeaveAffair> selectEmptyDept();
}
