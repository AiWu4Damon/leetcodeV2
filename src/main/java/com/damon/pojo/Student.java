package com.damon.pojo;

import com.google.common.collect.ArrayListMultimap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.UIManager.put;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/7 下午2:45
 * @Version 1.0.0
 **/
public class Student implements Person {

    @Override
    public void eat(String food) {
        ArrayListMultimap listMultimap = ArrayListMultimap.create();
        listMultimap.put("key1", "1");
        listMultimap.put("key1", "2");
        listMultimap.put("key1", food);
        System.out.println(listMultimap.get("key1"));

        Map<String, String> map = new HashMap<String, String>() {
            {
                put("a", "c");
            }
        };
        HashMap<String, String> h = new HashMap<String, String>() {{
            put("a", "b");
        }};
    }

    public static void main(String[] args) {
        new Student().eat("food");
    }
}
