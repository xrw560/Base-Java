package cn.ncut.java.designpattern.factorypattern.absfactory;

import cn.ncut.java.designpattern.factorypattern.pizza.Pizza;

/**
 * 抽象工厂模式：定义了一个接口用于创建相关或有依赖关系的对象族，而无需明确指定具体类
 * 把工厂变成工厂族
 */
public interface AbsFactory {
    public Pizza CreatePizza(String orderType);
}
