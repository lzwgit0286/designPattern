package com.lzw.state;

/**
 * @author zhuwu.long
 * @Date 2020/6/8 21:35
 */
public class StateA extends State {

    @Override
    public void handle1() {
        System.out.println("StateA handle 1");

    }

    @Override
    //我处理不了，让StateB处理
    public void handle2() {
        this.stateContext.setCurrentState(StateContext.stateB);
        this.stateContext.process2();
    }
}
