package com.damon.innerouter;

import java.util.List;

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

    public LinkedList getInstance(){
        return LazyLoad.linkedList;
    }

    private static class Node{
        private void print(){
            System.out.println(LinkedList.NUM);
        }
    }

    private static class LazyLoad{
        private static LinkedList linkedList = new LinkedList();
    }




}
