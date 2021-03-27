package com.lzw.visitor;

/**
 * @author zhuwu.long
 * @Date 2020/8/12 21:15
 */
public class ConcreteVisitor1 implements Visitor {

    @Override
    public void visitorElementA(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor1 visit elementA" );
    }

    @Override
    public void visitorElementB(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor1 visit elementB" );
    }
}
