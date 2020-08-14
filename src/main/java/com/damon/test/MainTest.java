package com.damon.test;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

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
        int a = 9;
        int b = 7;
        int a1= 16 & 0x1;
        HashMap<String, String> map = new HashMap<>(16);
        Set<Map.Entry<String, String>> entries = map.entrySet();
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

