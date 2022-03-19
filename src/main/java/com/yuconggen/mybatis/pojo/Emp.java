package com.yuconggen.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
        private Integer eid;
        private String empName;
        private Integer age;
        private String sex;
        private String email;
        private Dept dept;
        //...构造器、get、set方法等
}

