package cn.ncut.java.designpattern.factorypattern.pizza;

public class ChinesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("ChinesePizza");

        System.out.println(name + " preparing;");
    }

}
