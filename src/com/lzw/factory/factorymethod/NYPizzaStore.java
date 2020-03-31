package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:36
 */
public class NYPizzaStore extends PizzaStore {

    protected  Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equalsIgnoreCase(type)){
            pizza = new NYCheesePizza();
        }else if("vega".equalsIgnoreCase(type)){
            pizza = new NYVegaPizza();
        }
        return pizza;
    };

}
