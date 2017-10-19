package cn.ncut.java.designpattern.factorypattern.pizza;

public class NYPepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("NYPepperPizza");
        System.out.println(name + " preparing;");
    }

}
