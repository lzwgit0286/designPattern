package com.lzw.templatemethod;

/**
 * @author zhuwu.long
 * @Date 2020/4/18 10:43
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Tea brew");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Tea add condiments");
    }

    @Override
    boolean customerWantsCondiments() {
        return true;
    }
}
