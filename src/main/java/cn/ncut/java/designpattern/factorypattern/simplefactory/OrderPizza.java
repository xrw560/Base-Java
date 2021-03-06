package cn.ncut.java.designpattern.factorypattern.simplefactory;

import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    SimplePizzaFactory mSimplePizzaFactory;

    public OrderPizza(SimplePizzaFactory mSimplePizzaFactory) {
        setFactory(mSimplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory mSimplePizzaFactory) {
        Pizza pizza = null;
        String orderType;

        this.mSimplePizzaFactory = mSimplePizzaFactory;

        do {
            orderType = gettype();
            pizza = mSimplePizzaFactory.CreatePizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }

        } while (true);
    }

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
