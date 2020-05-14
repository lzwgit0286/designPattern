package com.lzw.templatemethod;

/**
 * @author zhuwu.long
 * @Date 2020/4/18 10:50
 */
public class TemplateMethodTest {
    public static void main(String[] args){
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("---------------------------- 分割线 —————————————");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
