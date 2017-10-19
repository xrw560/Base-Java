package cn.ncut.java.designpattern.strategyPattern.duck;

import cn.ncut.java.designpattern.strategyPattern.flybehavior.BadFlyBehavior;
import cn.ncut.java.designpattern.strategyPattern.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("**RedHead**");
    }

}
