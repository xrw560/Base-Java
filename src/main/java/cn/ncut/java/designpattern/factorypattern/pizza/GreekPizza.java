package cn.ncut.java.designpattern.factorypattern.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("GreekPizza");

        System.out.println(name + " preparing;");
    }

}
