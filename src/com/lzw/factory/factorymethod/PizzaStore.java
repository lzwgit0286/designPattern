package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:36
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
