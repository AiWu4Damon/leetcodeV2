package com.damon.ergodic;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Damon
 * @Date 2020/8/14 下午1:35
 * @Version 1.0.0
 **/
public class Main {
    private static List<String> collection = null;
    {
        collection = new LinkedList<>();
    }

    public void forI(){
        for (int i = 0; i < collection.size(); i++) {
            String item = collection.get(i);
            System.out.println(item);
        }
    }

    public void forStrong(){
        for (String item : collection) {
            System.out.println(item);
        }
    }

    public void forEach(){
        collection.forEach(System.out::println);
    }

    public void forEachFor8(){
        collection.parallelStream().forEach(System.out::println);
    }

    public static void main(String[] args) {

    }




}
