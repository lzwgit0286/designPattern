package com.lzw.factory.simplefactory;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:33
 */
public class SimplePizzaFactory {
    Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equalsIgnoreCase(type)){
            pizza = new CheesePizza();
        }else if("vega".equalsIgnoreCase(type)){
            pizza = new VegaPizza();
        }
        return pizza;
    }
}
