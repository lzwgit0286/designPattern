package com.lzw.proxy;

/**
 * @author zhuwu.long
 * @Date 2020/7/1 21:12
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real Request...");
    }
}
