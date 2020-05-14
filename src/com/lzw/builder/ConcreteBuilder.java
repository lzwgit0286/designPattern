package com.lzw.builder;

/**
 * @author zhuwu.long
 * @Date 2020/5/11 22:42
 */
public class ConcreteBuilder extends AbstractBuilder {
    Product product = new Product();

    @Override
    void buildPart1() {
        product.parts.add("part1");
    }

    @Override
    void buildPart2() {
        product.parts.add("part2");
    }

    @Override
    Product retrieveProduct() {
        return product;
    }
}
