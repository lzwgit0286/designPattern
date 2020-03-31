package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/31 21:08
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equalsIgnoreCase(type)){
            pizza = new ChicagoCheesePizza();
        }else if("vega".equalsIgnoreCase(type)){
            pizza = new ChicagoVegaPizza();
        }
        return pizza;
    }
}
