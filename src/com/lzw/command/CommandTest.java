package com.lzw.command;

/**
 * @author zhuwu.long
 * @Date 2020/7/16 22:10
 */
public class CommandTest {

    public static void main(String[] args) {
        Receiver1 receiver1 = new Receiver1();
        Command command1 = new ConcreteCommand1(receiver1);
        Invoker invoker = new Invoker(command1);
        invoker.process();

        Receiver2 receiver2 = new Receiver2();
        Command command2 = new ConcreteCommand2(receiver2);
        invoker = new Invoker(command2);
        invoker.process();

    }
}
