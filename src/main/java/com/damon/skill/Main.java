package com.damon.skill;

public class Main {

    public static void main(String[] args) {
        MultipleTwoReturn<String, String> stringStringMultipleTwoReturn = returnTwo();
        String a = stringStringMultipleTwoReturn.getA();
        System.out.println(a);
    }

    public static MultipleTwoReturn<String,String>returnTwo(){
        return new MultipleTwoReturn<String,String>("1","2");
    }
}
