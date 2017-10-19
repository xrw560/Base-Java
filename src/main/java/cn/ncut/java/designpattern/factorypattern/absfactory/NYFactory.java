package cn.ncut.java.designpattern.factorypattern.absfactory;

import cn.ncut.java.designpattern.factorypattern.pizza.NYCheesePizza;
import cn.ncut.java.designpattern.factorypattern.pizza.NYPepperPizza;
import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

public class NYFactory implements AbsFactory {

    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;

    }

}
