package cn.ncut.java.designpattern.factorypattern.pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("LDPepperPizza");

        System.out.println(name + " preparing;");
    }

}
