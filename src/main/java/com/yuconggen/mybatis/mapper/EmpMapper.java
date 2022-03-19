package com.yuconggen.mybatis.mapper;
import com.yuconggen.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EmpMapper {
    List<Emp> selectEmp();

    /**
     * 查询员工及其部门信息
     * @param eid
     * @return
     */
    Emp selectEmpAndDept(@Param("eid")int eid);

    Emp selectEmpOne(@Param("eid") Integer eid);
}
