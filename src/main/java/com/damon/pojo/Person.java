package com.damon.pojo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Damon
 * @Date 下午2:43
 * @Version 1.0.0
 **/
public interface Person {
    /**
     * 吃
     * @param food 食物
     */
    void eat(String food);
}
