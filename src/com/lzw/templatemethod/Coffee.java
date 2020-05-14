package com.lzw.templatemethod;

/**
 * @author zhuwu.long
 * @Date 2020/4/18 10:43
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Coffee brew");
    }

    @Override
    protected void addCondiments() {

    }
}
