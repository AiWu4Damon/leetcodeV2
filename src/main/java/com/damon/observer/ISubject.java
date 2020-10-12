package com.damon.observer;

/**
 * @author damon
 */
public interface ISubject {

    /**
     * 增加一个观察者
     * @param o 观察者
     * @return 观察队列
     */
    boolean addObserver(Observer o);

    /**
     * 删除一个观察者
     * @param o 观察者
     * @return 观察队列
     */
    boolean deleteObserver(Observer o);

    /**
     * 删除一个末尾的一个观察者
     * @return 观察队列
     */
    Observer deleteObserver();

    /**
     * 提醒所有的观察者
     * 执行相关的
     */
    void notifyObserver();
}
