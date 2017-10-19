package cn.ncut.java.designpattern.factorypattern.method;

import cn.ncut.java.designpattern.factorypattern.pizza.LDCheesePizza;
import cn.ncut.java.designpattern.factorypattern.pizza.LDPepperPizza;
import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }

}
