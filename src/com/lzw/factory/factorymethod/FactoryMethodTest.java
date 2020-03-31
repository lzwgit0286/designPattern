package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:33
 */
public class FactoryMethodTest {
    public static void main(String[] agrs){
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");

        System.out.println(" ==================== ");
        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("vega");
    }

}
