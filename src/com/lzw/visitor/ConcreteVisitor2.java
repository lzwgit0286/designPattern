package com.lzw.visitor;

/**
 * @author zhuwu.long
 * @Date 2020/8/12 21:15
 */
public class ConcreteVisitor2 implements Visitor {

    @Override
    public void visitorElementA(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor2  visit elementA" );
    }

    @Override
    public void visitorElementB(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor2  visit elementB" );
    }
}
