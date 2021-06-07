package com.damon.observer.impl;

import com.damon.observer.Observer;

/**
 * @author damon
 */
public class Observer1 implements Observer {
    @Override
    public String response() {
        System.out.println("我是Observer1,我得到了通知");
        return null;
    }
}
