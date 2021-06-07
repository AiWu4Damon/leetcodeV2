package com.damon.test;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/24 上午10:14
 * @Version 1.0.0
 **/
public class MainTest {
    private String name;

    public final static String DEFAULT_FORMAT    = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) throws Exception{
//        System.out.println(System.getProperty("file.encoding"));
//        System.out.println(System.getProperty("sun.jnu.encoding"));
//        Student student = new Student();
//        student.setName("damon");
//        student.put("1","1");
//        Student student2 = new Student();
//        BeanUtils.copyProperties(student,student2);
//        student2.putAll(student);
//        System.out.println(JSON.toJSONString(student2));
//        Stream<String> stream = Stream.of("1", "2", "3");
//
//        Stream<String> concat = Stream.concat(stream, Stream.of("1"));
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        Iterator<String> iterator = arrayList.iterator();
//        iterator.hasNext();
//        iterator.next();

        Student student = new Student();
        student.setName("name");
        student.setAge("20");
        System.out.println(JSON.toJSONString(student));
    }

    public static Date parseDateTime(String dateValue, String format) {
        if (StringUtils.isEmpty(dateValue) || StringUtils.isEmpty(format)) {
            return null;
        }
        SimpleDateFormat obj = new SimpleDateFormat(format);
        try {
            return obj.parse(dateValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 指定日期时间增加小时数
     *
     * @param date
     * @param days
     * @return
     */
    public static Date addDateDay(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, days);
        return cal.getTime();
    }


    @Override
    public String toString() {
        return "MainTest{" +
                "name='" + name + '\'' +
                '}';
    }
    //    @Override
    public String toString2() {
        return ToStringBuilder.reflectionToString(this);
    }
}

