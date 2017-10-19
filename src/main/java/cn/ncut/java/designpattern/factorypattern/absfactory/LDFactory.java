package cn.ncut.java.designpattern.factorypattern.absfactory;

import cn.ncut.java.designpattern.factorypattern.pizza.LDCheesePizza;
import cn.ncut.java.designpattern.factorypattern.pizza.LDPepperPizza;
import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

public class LDFactory implements AbsFactory {

    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }

}
