package cn.ncut.java.designpattern.factorypattern.simplefactory;

import cn.ncut.java.designpattern.factorypattern.pizza.CheesePizza;
import cn.ncut.java.designpattern.factorypattern.pizza.GreekPizza;
import cn.ncut.java.designpattern.factorypattern.pizza.PepperPizza;
import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

/**
 * 变化部分抽取出来
 * <p>
 * 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行为。
 * <p>
 * 简单工厂模式设计方案：定义一个实例化披萨对象的类，封装创建对象的代码
 */
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
