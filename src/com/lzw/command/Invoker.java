package com.lzw.command;

/**
 * @author zhuwu.long
 * @Date 2020/7/16 22:09
 */
public class Invoker {
    Command command;
    public Invoker(Command command){
        this.command = command;
    }

    public void process(){
        this.command.execute();
    }
}
