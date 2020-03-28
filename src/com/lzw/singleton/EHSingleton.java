package com.lzw.singleton;

/**
 * 饿汉
 * @author zhuwu.long
 * @Date 2020/3/28 19:02
 */
public class EHSingleton {
    private static final EHSingleton INSTANCE = new EHSingleton();
    private EHSingleton(){
    }

    public static EHSingleton getInstance(){
        return INSTANCE;
    }
}
