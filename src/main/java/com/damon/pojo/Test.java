package com.damon.pojo;

public class Test {
        public static void main(String[] args){
    }
        public void test(int b) {
            int a = 1;
            new Thread(){
                @Override
                public void
                run() {
                    System.out.println(a);
                    System.out.println(b);
                };
            }.start();
        }
    }