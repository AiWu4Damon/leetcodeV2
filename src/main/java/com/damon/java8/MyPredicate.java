package com.damon.java8;

import java.util.function.Predicate;

/**
 * @ClassName MyPredicate
 * @Description TODO
 * @Author Damon
 * @Date 下午1:58
 * @Version 1.0.0
 **/
public interface MyPredicate<T> extends Predicate<T> {

    default void doMyTest(T t){
        test(t);
        System.out.println(true);
    }

}
