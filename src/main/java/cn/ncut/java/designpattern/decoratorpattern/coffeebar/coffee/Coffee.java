package cn.ncut.java.designpattern.decoratorpattern.coffeebar.coffee;

import cn.ncut.java.designpattern.decoratorpattern.coffeebar.Drink;

/**
 * 主体中间层
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
