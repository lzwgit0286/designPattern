package com.lzw.chain;

/**
 * @author zhuwu.long
 * @Date 2020/6/10 18:33
 */
public abstract class AbstractChain {
    private AbstractChain next;

    public final void handleRequest(Request request){
        if(request.getLevel() == this.getLevel() ){
            this.process();
        }else if(this.next != null){
            this.next.process();
        }else{
            System.out.println("不可能完成的任务");
        }
    }

    abstract void process();
    abstract Level getLevel();
    public void setNext(AbstractChain next) {
        this.next = next;
    }
}
