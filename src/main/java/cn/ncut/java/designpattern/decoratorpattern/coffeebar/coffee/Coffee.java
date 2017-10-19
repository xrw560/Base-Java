package cn.ncut.java.designpattern.decoratorpattern.coffeebar.coffee;


import cn.ncut.java.designpattern.decoratorpattern.coffeebar.Drink;

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
