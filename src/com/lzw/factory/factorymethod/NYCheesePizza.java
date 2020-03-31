package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/31 21:05
 */
public class NYCheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("NY Cheese prepare");
    }

    @Override
    void bake() {
        System.out.println("NY Cheese bake");
    }

    @Override
    void cut() {
        System.out.println("NY Cheese cut");
    }

    @Override
    void box() {
        System.out.println("NY Cheese box");
    }
}
