package cn.ncut.java.designpattern.adapterpattern;

import cn.ncut.java.designpattern.adapterpattern.adapter.TurkeyAdapter2;
import cn.ncut.java.designpattern.adapterpattern.duck.Duck;
import cn.ncut.java.designpattern.adapterpattern.duck.GreenHeadDuck;
import cn.ncut.java.designpattern.adapterpattern.turkey.WildTurkey;

public class MainTest {
    public static void main(String[] args) {
        GreenHeadDuck duck = new GreenHeadDuck();

        WildTurkey turkey = new WildTurkey();

        Duck duck2turkeyAdapter = new TurkeyAdapter2();
        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        duck2turkeyAdapter.quack();
        duck2turkeyAdapter.fly();
    }
}
