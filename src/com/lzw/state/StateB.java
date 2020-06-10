package com.lzw.state;

/**
 * @author zhuwu.long
 * @Date 2020/6/8 21:35
 */
public class StateB extends State {

    @Override
    public void handle1() {
        this.stateContext.setCurrentState(StateContext.stateA);
        this.stateContext.process1();
    }

    @Override
    public void handle2() {
        System.out.println("StateB handle 2");
    }
}
