package com.damon.java8;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Damon
 * @Date 2020/8/20 下午1:33
 * @Version 1.0.0
 **/
public class Main {

    public static List<Apple>filterAppleNeed(List<Apple>allAppleList, MyPredicate<Apple>p){
        LinkedList<Apple> appleLinkedList = new LinkedList<Apple>();
        if (allAppleList == null || allAppleList.size() == 0){
            return appleLinkedList;
        }
        for (Apple apple : allAppleList) {
            if (p.test(apple)){
                appleLinkedList.add(apple);
            }
        }
        return appleLinkedList;
    }


    public static boolean filterAppleGreen(Apple apple){
        return "Green".equals(apple.getColor());
    }

    public static boolean filterAppleWeight(Apple apple){
        if (apple.getWeight() == null){
            return false;
        }
        return apple.getWeight()>=20;
    }


    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setColor("Green");
        apple.setWeight(20);
        List<Apple> appleNeed = filterAppleNeed(Arrays.asList(new Apple(), new Apple(), apple), Main::filterAppleGreen);
        List<Apple> appleNeed2 = filterAppleNeed(Arrays.asList(new Apple(), new Apple(), apple), Main::filterAppleWeight);
        System.out.println(appleNeed2.size());
    }
}
