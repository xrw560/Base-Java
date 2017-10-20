package cn.ncut.java.designpattern.decoratorpattern.coffeebar;

import cn.ncut.java.designpattern.decoratorpattern.coffeebar.coffee.Decaf;
import cn.ncut.java.designpattern.decoratorpattern.coffeebar.coffee.LongBlack;
import cn.ncut.java.designpattern.decoratorpattern.coffeebar.decorator.Chocolate;
import cn.ncut.java.designpattern.decoratorpattern.coffeebar.decorator.Milk;

/**
 * 装饰者模式：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性。
 */
public class CoffeeBar {

    public static void main(String[] args) {

        Drink order;
        order = new Decaf();
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());

        System.out.println("****************");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        //递归调用
        //order2 desc:Chocolate-3.0&&Chocolate-3.0&&Milk-2.0&&LongBlack-6.0
        System.out.println("order2 desc:" + order.getDescription());

    }

}
