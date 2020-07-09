package com.damon.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName TestForCountDownLatch
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/9 下午6:41
 * @Version 1.0.0
 **/
public class TestForCountDownLatch {


    public static void main(String[] args) {
        CountDownLatch start = new CountDownLatch(10);
        Runnable a = new MyWork(start);
        for (int i = 0; i < 10; i++) {
            new Thread(a).start();
        }
        try {
            start.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是10个");
    }
}
