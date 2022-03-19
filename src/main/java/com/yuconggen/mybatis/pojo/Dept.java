package com.yuconggen.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private int did;
    private String deptName;
    private List<Emp> emps;
}
