package com.lzw.proxy;

/**
 * @author zhuwu.long
 * @Date 2020/7/1 21:13
 */
public class Proxy implements Subject {
    Subject realSubject = null;
    public Proxy(Subject subject){
        this.realSubject = subject;
    }
    @Override
    public void request() {
        System.out.println("proxy invoking... ");
        realSubject.request();
    }
}
