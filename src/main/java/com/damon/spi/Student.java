package com.damon.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.ChannelHandler;

public class Student implements Person{
    private Integer id;

    @Override
    public void test(URL url,String a) {
        System.out.println(a);
        System.out.println("我是stu");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
