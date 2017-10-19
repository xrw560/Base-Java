package cn.ncut.java.designpattern.factorypattern.absfactory;


import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

public interface AbsFactory {

    public Pizza CreatePizza(String orderType);
}
