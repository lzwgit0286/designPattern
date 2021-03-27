package com.lzw.visitor;

/**
 * @author zhuwu.long
 * @Date 2020/8/12 21:06
 */
public interface Element {
    void accept(Visitor visitor);
}
