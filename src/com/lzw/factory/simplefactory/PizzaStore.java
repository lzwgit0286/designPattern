package com.lzw.factory.simplefactory;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:36
 */
public class PizzaStore {
    private SimplePizzaFactory pizzaFactory;
    public PizzaStore(SimplePizzaFactory factory){
        this.pizzaFactory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
