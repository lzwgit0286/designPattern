package com.lzw.command;

/**
 * @author zhuwu.long
 * @Date 2020/7/16 22:07
 */
public class ConcreteCommand2 implements Command {
    Receiver2 receiver2;
    public ConcreteCommand2(Receiver2 receiver1){
        this.receiver2 = receiver1;
    }

    @Override
    public void execute() {
        receiver2.doSomething2();
    }
}
