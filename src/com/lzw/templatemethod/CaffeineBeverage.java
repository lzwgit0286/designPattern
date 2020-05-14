package com.lzw.templatemethod;

/**
 * @author zhuwu.long
 * @Date 2020/4/18 10:39
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        popurInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    private void boilWater() {

    }

    private void popurInCup() {
    }



    boolean customerWantsCondiments(){
        return false;
    }
}
