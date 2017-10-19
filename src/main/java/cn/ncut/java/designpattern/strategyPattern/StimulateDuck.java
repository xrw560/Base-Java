package cn.ncut.java.designpattern.strategyPattern;


import cn.ncut.java.designpattern.strategyPattern.duck.Duck;
import cn.ncut.java.designpattern.strategyPattern.duck.GreenHeadDuck;
import cn.ncut.java.designpattern.strategyPattern.duck.RedHeadDuck;
import cn.ncut.java.designpattern.strategyPattern.flybehavior.NoFlyBehavior;
import cn.ncut.java.designpattern.strategyPattern.quackbehavior.NoQuackBehavior;

/**
 * 需要新的设计方式，应对项目的扩展性，降低复杂度：
 * 1）分析项目变化与不变部分，提取变化部分，抽象成接口+实现
 * 2）鸭子哪些功能是会根据新需求变化的？叫声、飞行。。。
 * <p>
 * 策略模式：分别封装行为接口，实现算法族，超类里放行为的接口对象，在子类里具体设定行为对象。
 * 原则就是：分离变化部分，封装接口，基于接口编程各种功能。
 * 此模式让行为算法的变化部分独立于算法的使用者。
 * <p>
 * 注意点：
 * 1. 分析项目中变化部分(行为族)与不变部分
 * 2. 多用组合少用继承；用行为类组合，而不是行为的继承。更有弹性
 * 3. 设计模式有没有相应的库直接使用？有些库或框架本身就是用某种设计模式设计的
 * 4. 如果找不到适用的模式怎么办？对项目分析不够透彻，23种设计模式中某个模式或模式组合
 */
public class StimulateDuck {

    public static void main(String[] args) {

        Duck mGreenHeadDuck = new GreenHeadDuck();
        Duck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.Fly();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();

        mRedHeadDuck.display();
        mRedHeadDuck.Fly();
        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();
        mRedHeadDuck.display();
//        mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
//        mRedHeadDuck.Fly();
//        mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
//        mRedHeadDuck.Quack();
    }

}
