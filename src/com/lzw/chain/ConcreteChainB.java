package com.lzw.chain;

/**
 * @author zhuwu.long
 * @Date 2020/6/10 18:43
 */
public class ConcreteChainB extends AbstractChain {

    @Override
    void process() {
        System.out.println("ConcreteChainB handle this request!");
    }

    @Override
    Level getLevel() {
        return Level.level2;
    }
}
