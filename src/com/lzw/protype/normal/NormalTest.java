package com.lzw.protype.normal;

/**
 * @author zhuwu.long
 * @Date 2020/5/14 21:41
 * 浅复制
 */
public class NormalTest {
    public static void main(String[] args) throws  Exception{
        Monkey m1 = new Monkey("swk", 10);
        GoldRing goldRing = new GoldRing(10f);
        m1.setGoldRing(goldRing);
        Monkey m2 = m1.clone();

        System.out.println(" m1 == m2 结果为" + (m1 == m2));
        System.out.println(" m1.goldRing == m2.goldRing 结果为" + (m1.getGoldRing() == m2.getGoldRing()));
    }
}
