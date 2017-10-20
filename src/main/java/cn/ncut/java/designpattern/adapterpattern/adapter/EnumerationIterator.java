package cn.ncut.java.designpattern.adapterpattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 枚举器到迭代器的适配
 * 对象方式适配
 */
public class EnumerationIterator implements Iterator<Object> {

    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
