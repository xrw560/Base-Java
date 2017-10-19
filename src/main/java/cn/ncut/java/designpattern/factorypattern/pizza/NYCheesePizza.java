package cn.ncut.java.designpattern.factorypattern.pizza;

public class NYCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("NYCheesePizza");

        System.out.println(name + " preparing;");
    }

}
