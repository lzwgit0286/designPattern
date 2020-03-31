package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/31 21:06
 */
public class NYVegaPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("NY VegaPizza prepare");
    }

    @Override
    void bake() {
        System.out.println("NY VegaPizza bake");
    }

    @Override
    void cut() {
        System.out.println("NY VegaPizza cut");
    }

    @Override
    void box() {
        System.out.println("NY VegaPizza box");
    }
}
