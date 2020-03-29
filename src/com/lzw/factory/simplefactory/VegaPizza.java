package com.lzw.factory.simplefactory;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:31
 */
public class VegaPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("VegaPizza prepare");
    }

    @Override
    void bake() {
        System.out.println("VegaPizza bake");
    }

    @Override
    void cut() {
        System.out.println("VegaPizza cut");
    }

    @Override
    void box() {
        System.out.println("VegaPizza box");
    }
}
