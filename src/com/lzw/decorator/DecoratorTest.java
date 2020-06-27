package com.lzw.decorator;

/**
 * @author zhuwu.long
 * @Date 2020/6/27 14:29
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component.operate();
    }
}
