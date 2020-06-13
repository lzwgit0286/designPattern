package com.lzw.adapter.classtype;

import com.lzw.adapter.Target;

/**
 * @author zhuwu.long
 * @Date 2020/6/13 16:59
 */
public class Adapter1 extends Adaptee1 implements Target {
    @Override
    public void doSomething() {
        super.doSpecialThings();
    }
}
