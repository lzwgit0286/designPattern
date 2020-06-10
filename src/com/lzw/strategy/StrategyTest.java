package com.lzw.strategy;

/**
 * @author zhuwu.long
 * @Date 2020/5/27 21:57
 */
public class StrategyTest {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.processing();

        strategy = new ConcreteStrategyB();
        context = new Context(strategy);
        context.processing();
    }
}
