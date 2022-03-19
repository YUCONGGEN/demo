package com.yuconggen.mybatis.mapper;


import com.yuconggen.mybatis.pojo.Dept;
import com.yuconggen.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
 Dept selectById(@Param("did") Integer did);



}
