package com.lzw.state;

/**
 * @author zhuwu.long
 * @Date 2020/6/8 21:52
 */
public class StateTest {

    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        stateContext.setCurrentState(StateContext.stateA);
        stateContext.process2();
        stateContext.process1();
    }
}
