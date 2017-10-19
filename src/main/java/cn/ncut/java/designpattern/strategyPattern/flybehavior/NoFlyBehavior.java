package cn.ncut.java.designpattern.strategyPattern.flybehavior;


public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("--NoFly--");
    }
}
