package cn.ncut.java.designpattern.factorypattern;

import cn.ncut.java.designpattern.factorypattern.pizza.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 初级设计
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;

        do {
            orderType = gettype();

            if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
            } else if (orderType.equals("greek")) {
                pizza = new GreekPizza();
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
            } else if (orderType.equals("chinese")) {
                pizza = new ChinesePizza();
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
