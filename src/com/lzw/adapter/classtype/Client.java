package com.lzw.adapter.classtype;

import com.lzw.adapter.Target;

/**
 * @author zhuwu.long
 * @Date 2020/6/13 17:01
 */
public class Client {

    public static void main(String[] args) {
        Target target1 = new Adapter1();
        target1.doSomething();
    }
}
