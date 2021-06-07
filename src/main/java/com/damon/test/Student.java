package com.damon.test;

import com.alibaba.fastjson.annotation.JSONType;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author damon
 */
@JSONType(orders = {"name","age"})
public class Student implements Serializable {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
