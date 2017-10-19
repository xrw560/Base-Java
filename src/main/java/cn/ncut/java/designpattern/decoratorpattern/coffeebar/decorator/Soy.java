package cn.ncut.java.designpattern.decoratorpattern.coffeebar.decorator;


import cn.ncut.java.designpattern.decoratorpattern.coffeebar.Drink;

public class Soy extends Decorator {

    public Soy(Drink Obj) {
        super(Obj);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }

}

