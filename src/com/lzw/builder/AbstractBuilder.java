package com.lzw.builder;

/**
 * @author zhuwu.long
 * @Date 2020/5/11 22:41
 */
public abstract class AbstractBuilder {
    abstract void buildPart1();
    abstract void buildPart2();

    abstract Product retrieveProduct();
}
