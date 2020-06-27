package com.lzw.observer;

/**
 * @author zhuwu.long
 * @Date 2020/6/21 10:34
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver(subject);
        subject.notice();
    }
}
