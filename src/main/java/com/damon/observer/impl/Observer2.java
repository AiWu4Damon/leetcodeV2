package com.damon.observer.impl;

import com.damon.observer.Observer;

/**
 * @author damon
 */
public class Observer2 implements Observer {
    @Override
    public String response() {
        System.out.println("我是Observer2，我得到了通知");
        return null;
    }
}
