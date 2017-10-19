package cn.ncut.java.designpattern.factorypattern.absfactory;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza mOrderPizza;
        mOrderPizza = new OrderPizza(new LDFactory());
    }

}
