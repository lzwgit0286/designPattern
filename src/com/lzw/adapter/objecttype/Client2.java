package com.lzw.adapter.objecttype;

import com.lzw.adapter.Target;

/**
 * @author zhuwu.long
 * @Date 2020/6/13 17:03
 */
public class Client2 {

    public static void main(String[] args) {
        Target target = new Adapter2(new Adaptee2());
        target.request();
    }
}
