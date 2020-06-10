package com.lzw.chain;

/**
 * @author zhuwu.long
 * @Date 2020/6/10 18:41
 */
public class ConcreteChainA extends AbstractChain {

    @Override
    void process() {
        System.out.println("ConcreteChainA handle this request!");
    }

    @Override
    Level getLevel() {
        return Level.level1;
    }
}
