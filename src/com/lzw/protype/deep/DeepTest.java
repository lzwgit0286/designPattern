package com.lzw.protype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author zhuwu.long
 * @Date 2020/5/14 21:47
 * 深复制
 */
public class DeepTest {
    public static void main(String[] args) throws  Exception{
        //方式1, DeepGoldRing也实现Cloneable
        DeepMonkey d1  = new DeepMonkey("aaa", 15);
        DeepGoldRing r1 = new DeepGoldRing(15f);
        d1.setGoldRing(r1);
        DeepMonkey d2 = d1.clone();

        System.out.println(" d1 == d2 结果为" + (d1 == d2));
        System.out.println(" d1.name == d2.name 结果为" + (d1.getName() == d2.getName()));
        System.out.println(" d1.goldRing == d2.goldRing 结果为" + (d1.getGoldRing() == d2.getGoldRing()));
        //Weight 是对象，所以clone时还是复制的引用，指向的是同一个对象 返回true
        System.out.println(" d1.goldRing.weight == d2.goldRing.weight 结果为" + (d1.getGoldRing().getWeight() == d2.getGoldRing().getWeight()));


        System.out.println();
        System.out.println("方式二 ");
        //方式2 序列化对象的方式，需要实现seriliable接口. 被嵌套的类也需要实现, Serializable接口，否则会报错.
        //比方式1要好，因为当对象中新增引用对象时，不需要修改clone的代码
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(d1);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        DeepMonkey d3 = (DeepMonkey)oi.readObject();

        System.out.println(" d1 == d3 结果为" + (d1 == d3));
        System.out.println(" d1.name == d3.name 结果为" + (d1.getName() == d3.getName()));
        System.out.println(" d1.goldRing == d3.goldRing 结果为" + (d1.getGoldRing() == d3.getGoldRing()));

    }
}
