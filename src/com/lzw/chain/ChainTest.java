package com.lzw.chain;

/**
 * @author zhuwu.long
 * @Date 2020/6/10 18:43
 */
public class ChainTest {
    public static void main(String[] args) {
        ConcreteChainA concreteChainA = new ConcreteChainA();
        ConcreteChainB concreteChainB = new ConcreteChainB();
        concreteChainA.setNext(concreteChainB);
        Request request = new Request(Level.level1);
        concreteChainA.handleRequest(request);

        request = new Request(Level.level2);
        concreteChainA.handleRequest(request);

    }
}
