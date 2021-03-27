package com.lzw.memento;

/**
 * @author zhuwu.long
 * @Date 2020/6/27 16:28
 */
public class Originator {
    private String state;

    Memento createMemento(){
        return new Memento(this.state);
    }

    void restore(Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
