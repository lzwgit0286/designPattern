package com.lzw.bridge;

/**
 * @author zhuwu.long
 * @Date 2020/5/24 10:04
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void process() {
        System.out.println("ConcreteImplementorB processing!");
    }
}
