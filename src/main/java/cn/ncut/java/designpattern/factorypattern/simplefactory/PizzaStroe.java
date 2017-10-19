package cn.ncut.java.designpattern.factorypattern.simplefactory;

public class PizzaStroe {
    public static void main(String[] args) {
        SimplePizzaFactory mSimplePizzaFactory;
        OrderPizza mOrderPizza;
        mOrderPizza = new OrderPizza(new SimplePizzaFactory());
    }
}
