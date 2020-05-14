package com.lzw.builder;

/**
 * @author zhuwu.long
 * @Date 2020/5/11 22:44
 */
public class Director {
    AbstractBuilder builder;
    public Director(AbstractBuilder builder){
       this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
