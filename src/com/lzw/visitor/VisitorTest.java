package com.lzw.visitor;

/**
 * @author zhuwu.long
 * @Date 2020/8/12 21:06
 */
public class VisitorTest {

    public static void main(String[] args) {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(elementA);
        objectStructure.addElement(elementB);

        Visitor visitor1 = new ConcreteVisitor1();
        objectStructure.accept(visitor1);
    }
}
