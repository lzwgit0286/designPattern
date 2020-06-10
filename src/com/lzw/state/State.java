package com.lzw.state;

/**
 * @author zhuwu.long
 * @Date 2020/6/8 21:34
 */
public abstract class State {
    abstract void handle1();
    abstract void handle2();
    StateContext stateContext;

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }
}
