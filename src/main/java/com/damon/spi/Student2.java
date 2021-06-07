package com.damon.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

public class Student2 implements Person{

    @Override
    public void test(URL url,String a) {
        System.out.println(a);
        System.out.println("我是stu2");
    }
}
