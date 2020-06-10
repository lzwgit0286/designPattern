package com.lzw.bridge;

/**
 * @author zhuwu.long
 * @Date 2020/5/24 10:03
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor){
        this.implementor = implementor;
    }

    @Override
    void doSometing() {
        implementor.process();
    }
}
