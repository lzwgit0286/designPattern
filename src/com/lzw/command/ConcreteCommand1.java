package com.lzw.command;

/**
 * @author zhuwu.long
 * @Date 2020/7/16 22:07
 */
public class ConcreteCommand1 implements Command {
    Receiver1 receiver1;
    public ConcreteCommand1(Receiver1 receiver1){
        this.receiver1 = receiver1;
    }

    @Override
    public void execute() {
        receiver1.doSomething();
    }
}
