package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/31 21:06
 */
public class ChicagoVegaPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Chicago VegaPizza prepare");
    }

    @Override
    void bake() {
        System.out.println("Chicago VegaPizza bake");
    }

    @Override
    void cut() {
        System.out.println("Chicago VegaPizza cut");
    }

    @Override
    void box() {
        System.out.println("Chicago VegaPizza box");
    }
}
