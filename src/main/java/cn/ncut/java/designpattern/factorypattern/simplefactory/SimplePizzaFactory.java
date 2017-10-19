package cn.ncut.java.designpattern.factorypattern.simplefactory;

import cn.ncut.java.designpattern.factorypattern.pizza.CheesePizza;
import cn.ncut.java.designpattern.factorypattern.pizza.GreekPizza;
import cn.ncut.java.designpattern.factorypattern.pizza.PepperPizza;
import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
