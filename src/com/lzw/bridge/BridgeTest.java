package com.lzw.bridge;

/**
 * @author zhuwu.long
 * @Date 2020/5/24 10:05
 */
public class BridgeTest {

    public static void main(String[] agrs){
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.doSometing();

         implementor = new ConcreteImplementorB();
         abstraction = new RefinedAbstraction(implementor);
         abstraction.doSometing();

    }
}
