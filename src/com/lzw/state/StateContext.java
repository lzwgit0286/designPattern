package com.lzw.state;

/**
 * @author zhuwu.long
 * @Date 2020/6/8 21:36
 */
public class StateContext {
    public  static StateA  stateA = new StateA();
    public  static StateB stateB = new StateB();
    private State currentState = null;

    public void process1(){
        this.currentState.handle1();
    }

    public void process2(){
        this.currentState.handle2();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setStateContext(this);
    }

}
