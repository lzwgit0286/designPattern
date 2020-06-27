package com.lzw.observer;

/**
 * @author zhuwu.long
 * @Date 2020/6/21 10:32
 */
public class ConcreteObserver implements Observer {

    public ConcreteObserver(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Observer get notice and update!");
    }
}
