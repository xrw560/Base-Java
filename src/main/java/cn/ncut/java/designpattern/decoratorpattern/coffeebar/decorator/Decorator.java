package cn.ncut.java.designpattern.decoratorpattern.coffeebar.decorator;

import cn.ncut.java.designpattern.decoratorpattern.coffeebar.Drink;

public class Decorator extends Drink {
    /**
     * 装饰对象，被装饰者或被包装过的对象
     */
    private Drink Obj;

    public Decorator(Drink Obj) {
        this.Obj = Obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    @Override
    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + Obj.getDescription();
    }

}
