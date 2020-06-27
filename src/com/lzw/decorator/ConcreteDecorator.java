package com.lzw.decorator;

/**
 * @author zhuwu.long
 * @Date 2020/6/27 14:27
 */
public class ConcreteDecorator extends AbstractDecorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        this.method();
        component.operate();
    }

    public void method(){
        System.out.println("装饰对象 A 自己的业务...");
    }
}
