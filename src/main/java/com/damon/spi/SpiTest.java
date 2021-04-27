package com.damon.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpiTest {

    public static void main(String[] args) {
//        ExtensionLoader<Person> extensionLoader = ExtensionLoader.getExtensionLoader(Person.class);
//        URL url = URL.valueOf("test://localhost/test?t=stu");
//        //自适应
//        Person adaptiveExtension = extensionLoader.getAdaptiveExtension();
//        adaptiveExtension.test(url,"test");
//
//        Random random = new Random();
//        int i = random.nextInt(5);
//
//        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
//        int[] a = {1,2,3};
//        List ints = Arrays.asList(a);

//        List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toList());

//        List<Integer> collect1 = IntStream.range(1, 10000).boxed().collect(Collectors.toList());
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(128);
//        integers.add(-1);
//        Integer i = 128;
//        integers.remove(128);
//        System.out.println(integers);
        Student student = new Student();
        student.setId(128);

        Student student2 = new Student();
        student2.setId(128);

        Student student3 = new Student();
        student3.setId(128);

        Student student4 = new Student();
        student4.setId(128);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student3);
        studentArrayList.add(student4);


        TreeSet<Student> studentTreeSet = new TreeSet<>(Comparator.comparingInt(Student::getId));
        studentTreeSet.add(student);
        studentTreeSet.add(student2);
        studentTreeSet.addAll(studentArrayList);

        System.out.println(studentTreeSet.size());
    }
}
