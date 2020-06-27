package com.lzw.decorator;

/**
 * @author zhuwu.long
 * @Date 2020/6/27 14:25
 */
public abstract class AbstractDecorator implements Component{
    protected Component component;
    public AbstractDecorator(Component component){
        this.component = component;
    }
}
