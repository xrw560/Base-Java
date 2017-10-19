package cn.ncut.java.designpattern.factorypattern.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("CheesePizza");
        System.out.println(name + " preparing;");
    }

}
