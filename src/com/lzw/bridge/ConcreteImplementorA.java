package com.lzw.bridge;

/**
 * @author zhuwu.long
 * @Date 2020/5/24 10:04
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void process() {
        System.out.println("ConcreteImplementorA processing!");
    }
}
