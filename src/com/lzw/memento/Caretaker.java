package com.lzw.memento;

/**
 * @author zhuwu.long
 * @Date 2020/6/27 16:32
 */
public class Caretaker {
    Memento memento;

    public void addMemento(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }
}
