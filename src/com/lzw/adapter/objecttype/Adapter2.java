package com.lzw.adapter.objecttype;

import com.lzw.adapter.Target;

/**
 * @author zhuwu.long
 * @Date 2020/6/13 17:03
 */
public class Adapter2 implements Target {
    private Adaptee2 adaptee2;
    public Adapter2(Adaptee2 adaptee2){
        this.adaptee2 = adaptee2;
    }

    @Override
    public void request() {
        adaptee2.doSpecialThing2();
    }
}
