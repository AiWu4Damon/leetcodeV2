package com.damon.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author damon
 */
public abstract class AbstractSubject implements ISubject{
    protected List<Observer> observers;

    {
        observers = new LinkedList<>();
    }

    @Override
    public boolean addObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public Observer deleteObserver() {
        if (observers.size() == 0){
            return null;
        }
        return observers.remove(observers.size()-1);
    }

    @Override
    public boolean deleteObserver(Observer observer) {
        return observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
