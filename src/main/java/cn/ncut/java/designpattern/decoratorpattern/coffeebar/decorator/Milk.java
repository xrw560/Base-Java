package cn.ncut.java.designpattern.decoratorpattern.coffeebar.decorator;


import cn.ncut.java.designpattern.decoratorpattern.coffeebar.Drink;

public class Milk extends Decorator {

    public Milk(Drink Obj) {
        super(Obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }

}

