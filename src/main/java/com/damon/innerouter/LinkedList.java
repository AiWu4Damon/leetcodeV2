package com.damon.innerouter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LinkedList
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/7 上午10:36
 * @Version 1.0.0
 **/
public class LinkedList {
    private static int NUM = 9;
    private LinkedList LinkedList1;

    {
        System.out.println("linkedList");
    }

    public static LinkedList getInstance() {
        System.out.println(LazyLoad.linkedList);
        return LazyLoad.linkedList;
    }

    private static class Node {
        private void print() {
            System.out.println(LinkedList.NUM);
        }
    }

    static class LazyLoad {
        public String test;
        private static LinkedList linkedList = new LinkedList();

        {
            System.out.println("LazyLoad运算");
        }
    }

    private class InnerPrivate {
        public void sy() {
            System.out.println(LinkedList1);
        }
    }

    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<String,String>(){
//            {
//                put("1","2");
//            }
//        };
        getInstance();
    }

}
