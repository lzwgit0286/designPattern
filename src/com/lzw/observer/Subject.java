package com.lzw.observer;

/**
 * @author zhuwu.long
 * @Date 2020/6/21 10:29
 */
public interface Subject {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notice();
}
