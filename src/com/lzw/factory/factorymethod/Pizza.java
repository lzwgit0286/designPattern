package com.lzw.factory.factorymethod;

/**
 * @author zhuwu.long
 * @Date 2020/3/29 20:27
 */
public abstract class Pizza {
   abstract void prepare();
   abstract void bake();
   abstract void cut();
   abstract void box();
}
