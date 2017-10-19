package cn.ncut.java.designpattern.strategyPattern.oo;

/**
 * 继承的问题：对类的局部改动，尤其超类的局部改动，会影响其他部分。影响会有溢出效应
 * <p>
 * 超类挖的一个坑，每个子类都要来填，增加工作量，复杂度O(N^2)。不是好的设计方式
 */
public class StimulateDuck {

    public static void main(String[] args) {

        GreenHeadDuck mGreenHeadDuck = new GreenHeadDuck();
        RedHeadDuck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.Fly();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();

        mRedHeadDuck.display();

        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();
        mRedHeadDuck.Fly();

        //	mGreenHeadDuck.Fly();
        //mRedHeadDuck.Fly();
    }

}
