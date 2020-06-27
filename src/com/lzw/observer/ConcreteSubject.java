package com.lzw.observer;

import java.util.Vector;

/**
 * @author zhuwu.long
 * @Date 2020/6/21 10:30
 */
public class ConcreteSubject implements Subject {
    Vector<Observer> observers = new Vector<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice() {
        for(Observer observer : observers){
            observer.update();
        }
    }
}
