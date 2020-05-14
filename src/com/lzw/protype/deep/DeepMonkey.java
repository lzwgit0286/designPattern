package com.lzw.protype.deep;

import java.io.Serializable;

/**
 * @author zhuwu.long
 * @Date 2020/5/14 21:38
 */
public class DeepMonkey implements Cloneable , Serializable {
    private String name;
    private int age;
    private DeepGoldRing goldRing;

    DeepMonkey(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    protected DeepMonkey clone() throws CloneNotSupportedException {
        DeepMonkey d =  (DeepMonkey)super.clone();
        d.setGoldRing(d.getGoldRing().clone());
        return d;
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

    public DeepGoldRing getGoldRing() {
        return goldRing;
    }

    public void setGoldRing(DeepGoldRing goldRing) {
        this.goldRing = goldRing;
    }
}
