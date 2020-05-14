package com.lzw.protype.normal;

/**
 * @author zhuwu.long
 * @Date 2020/5/14 21:38
 */
public class Monkey implements Cloneable {
    private String name;
    private int age;
    private GoldRing goldRing;

    Monkey(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    protected Monkey clone() throws CloneNotSupportedException {
        return (Monkey)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GoldRing getGoldRing() {
        return goldRing;
    }

    public void setGoldRing(GoldRing goldRing) {
        this.goldRing = goldRing;
    }
}
