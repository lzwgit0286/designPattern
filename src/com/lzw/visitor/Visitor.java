package com.lzw.visitor;

/**
 * @author zhuwu.long
 * @Date 2020/8/12 21:08
 *
 *
 */
public interface Visitor {
    void visitorElementA(ConcreteElementA elementA);

    void visitorElementB(ConcreteElementB elementB);
}
