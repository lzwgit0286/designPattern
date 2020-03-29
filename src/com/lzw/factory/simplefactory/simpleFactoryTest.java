package com.lzw.factory.simplefactory;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:33
 */
public class simpleFactoryTest {
    public static void main(String[] agrs){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        new PizzaStore(factory).orderPizza("cheese");
    }
}
