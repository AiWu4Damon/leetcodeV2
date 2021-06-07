package com.damon.observer.impl;

import com.damon.observer.AbstractSubject;
import com.damon.observer.Observer;

/**
 * @author damon
 */
public class MySubject extends AbstractSubject {
    @Override
    public void notifyObserver() {
        observers.forEach(Observer::response);
    }
}
