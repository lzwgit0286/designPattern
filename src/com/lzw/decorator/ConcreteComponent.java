package com.lzw.decorator;

/**
 * @author zhuwu.long
 * @Date 2020/6/27 14:28
 */
public class ConcreteComponent implements Component {

    @Override
    public void operate() {
        System.out.println("具体 Component operator");
    }
}
