package cn.ncut.java.designpattern.adapterpattern.adapter;


import cn.ncut.java.designpattern.adapterpattern.duck.Duck;
import cn.ncut.java.designpattern.adapterpattern.turkey.WildTurkey;

/**
 * 类适配器
 */
public class TurkeyAdapter2 extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }
}
