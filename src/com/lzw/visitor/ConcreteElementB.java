package com.lzw.visitor;

/**
 * @author zhuwu.long
 * @Date 2020/8/12 21:07
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorElementB(this);
    }
}
