package com.lzw.mediator;

/**
 * @author zhuwu.long
 * @Date 2020/6/29 10:42
 */
public abstract class Colleague {
    protected AbstractMediator mediator;
    public Colleague(AbstractMediator mediator){
        this.mediator = mediator;
    }

    abstract void method1();
    abstract void method2();
}
