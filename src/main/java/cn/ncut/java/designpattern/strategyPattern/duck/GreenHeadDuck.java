package cn.ncut.java.designpattern.strategyPattern.duck;


import cn.ncut.java.designpattern.strategyPattern.flybehavior.GoodFlyBehavior;
import cn.ncut.java.designpattern.strategyPattern.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("**GreenHead**");
    }

}