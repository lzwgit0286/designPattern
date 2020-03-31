package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:29
 */
public class CheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Cheese Pizza prepare");
    }

    @Override
    void bake() {
        System.out.println("Cheese Pizza bake");
    }

    @Override
    void cut() {
        System.out.println("Cheese Pizza cut");
    }

    @Override
    void box() {
        System.out.println("Cheese Pizza box");
    }
}
