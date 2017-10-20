package cn.ncut.java.designpattern.factorypattern.method;

import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类。
 * 工厂方法模式将对象的实例化推迟到子类。
 * <p>
 * 工厂方法模式设计方案：将披萨项目里的披萨对象实例化功能抽象成抽象方法，在不同加盟店具体实现功能。
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = gettype();
            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    abstract Pizza createPizza(String ordertype);

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
