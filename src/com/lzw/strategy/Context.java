package com.lzw.strategy;

/**
 * @author zhuwu.long
 * @Date 2020/5/27 21:56
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void processing(){
        this.strategy.doSomething();
    }
}
