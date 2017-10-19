package cn.ncut.java.designpattern.factorypattern.method;

import cn.ncut.java.designpattern.factorypattern.pizza.NYCheesePizza;
import cn.ncut.java.designpattern.factorypattern.pizza.NYPepperPizza;
import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
