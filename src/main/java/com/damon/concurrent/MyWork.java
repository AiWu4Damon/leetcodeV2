package com.damon.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyWork
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/9 下午6:41
 * @Version 1.0.0
 **/
public class MyWork implements Runnable {
    private volatile int i = 0;
    private CountDownLatch startLatch;
    @Override
    public void run() {
        synchronized (MyWork.class){
            startLatch.countDown();
            i++;
            System.out.println("i: "+i);
        }
    }
    public MyWork(CountDownLatch startLatch){
        this.startLatch=startLatch;
    }
}
