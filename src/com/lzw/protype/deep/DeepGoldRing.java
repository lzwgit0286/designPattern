package com.lzw.protype.deep;

import java.io.Serializable;

/**
 * @author zhuwu.long
 * @Date 2020/5/14 21:40
 */
public class DeepGoldRing implements Cloneable, Serializable {
    private Float weight;

    DeepGoldRing(Float weight){
        this.weight = weight;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    protected DeepGoldRing clone() throws CloneNotSupportedException {
        return (DeepGoldRing) super.clone();
    }
}
