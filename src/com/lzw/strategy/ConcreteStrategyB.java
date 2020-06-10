package com.lzw.strategy;

/**
 * @author zhuwu.long
 * @Date 2020/5/27 21:54
 */
public class ConcreteStrategyB implements Strategy{

    @Override
    public void doSomething() {
        System.out.println("ConcreteStrategyB do something");
    }
}
