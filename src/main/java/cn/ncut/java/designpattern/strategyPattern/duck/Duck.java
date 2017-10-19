package cn.ncut.java.designpattern.strategyPattern.duck;


import cn.ncut.java.designpattern.strategyPattern.flybehavior.FlyBehavior;
import cn.ncut.java.designpattern.strategyPattern.quackbehavior.QuackBehavior;

public abstract class Duck {

    /**
     * 两个行为对象
     */
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck() {

    }

    /**
     * 变化部分
     */
    public void Fly() {
        mFlyBehavior.fly();
    }

    public void Quack() {
        mQuackBehavior.quack();
    }

    public abstract void display();

    /**
     * 可以动态改变行为
     */
    public void SetQuackBehavoir(QuackBehavior qb) {
        mQuackBehavior = qb;
    }

    public void SetFlyBehavoir(FlyBehavior fb) {
        mFlyBehavior = fb;
    }

    /**
     * 不变部分
     */
    public void swim() {
        System.out.println("~~im swim~~");
    }
}
