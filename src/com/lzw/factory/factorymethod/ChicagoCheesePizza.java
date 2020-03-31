package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/31 21:05
 */
public class ChicagoCheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Chicago Cheese prepare");
    }

    @Override
    void bake() {
        System.out.println("Chicago Cheese bake");
    }

    @Override
    void cut() {
        System.out.println("Chicago Cheese cut");
    }

    @Override
    void box() {
        System.out.println("Chicago Cheese box");
    }
}
