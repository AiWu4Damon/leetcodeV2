package com.damon.ergodic;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.apache.commons.lang3.StringUtils;

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
    static{
        collection = new LinkedList<>();
    }

    public static void forI(){
        for (int i = 0; i < collection.size(); i++) {
            String item = collection.get(i);
            System.out.println(item);
        }
    }

    public static void forStrong(){
        for (String item : collection) {
            System.out.println(item);
        }
    }

    public static void forEach(){
        collection.forEach(System.out::println);
    }

    public static void forEachFor8(){
        collection.parallelStream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int size = 100;
        for (int i = 0; i < size; i++) {
            collection.add(String.valueOf(i));
        }
        long start = System.currentTimeMillis();
        forI();
        long start1 = System.currentTimeMillis();
        System.out.println("forI 花费时间:"+(start1-start));
        forStrong();
        long start2 = System.currentTimeMillis();
        System.out.println("forStrong 花费时间:"+(start2-start1));
        forEach();
        long start3 = System.currentTimeMillis();
        System.out.println("forEach 花费时间:"+(start3-start2));
        forEachFor8();
        long start4 = System.currentTimeMillis();
        System.out.println("forEachFor8 花费时间:"+(start4-start3));
    }

    public static <K, V> ListMultimap<K, V> list2ListMultimap(List<V> list, String keyName) {

        ListMultimap<K, V> map = ArrayListMultimap.create();

        if (CollectionUtils.isEmpty(list) || StringUtils.isBlank(keyName)) {
            return map;
        }

        try {
            for (int i = 0; i < list.size(); i++) {
                V value = list.get(i);
                K k = (K) PropertyUtils.getProperty(value, keyName);
                map.put(k, value);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("field can't match the key!");
        }
        return map;
    }

}
