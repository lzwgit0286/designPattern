package com.lzw.memento;

/**
 * @author zhuwu.long
 * @Date 2020/6/27 16:31
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
