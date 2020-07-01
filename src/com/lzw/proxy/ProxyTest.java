package com.lzw.proxy;

/**
 * @author zhuwu.long
 * @Date 2020/7/1 21:14
 */
public class ProxyTest {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
