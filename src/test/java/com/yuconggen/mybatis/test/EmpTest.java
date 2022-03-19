package com.yuconggen.mybatis.test;

import com.yuconggen.mybatis.mapper.DeptMapper;
import com.yuconggen.mybatis.mapper.EmpMapper;
import com.yuconggen.mybatis.pojo.Dept;
import com.yuconggen.mybatis.pojo.Emp;
import com.yuconggen.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class EmpTest {
    @Test
    public void selectTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper= sqlSession.getMapper(EmpMapper.class);
        Emp lists= mapper.selectEmpOne(2);
        System.out.println(lists);
    }
    @Test
    public void selectTest1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper= sqlSession.getMapper(DeptMapper.class);
        Dept lists= mapper.selectById(1);
        System.out.println(lists);
    }
}
