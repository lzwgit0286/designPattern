package com.lzw.builder;

/**
 * @author zhuwu.long
 * @Date 2020/5/11 22:44
 */
public class BuilderTest {

    public static void main(String[] agrs){
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveProduct();
        System.out.println(product.parts);
    }
}
