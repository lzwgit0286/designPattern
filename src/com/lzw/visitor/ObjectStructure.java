package com.lzw.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuwu.long
 * @Date 2020/8/12 21:18
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element){
        elements.add(element);
    }

    public void removeElement(Element e){
        elements.remove(e);
    }

    public void accept(Visitor visitor){
        for(Element element : elements){
            element.accept(visitor);
        }
    }

}
