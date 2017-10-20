package cn.ncut.java.designpattern.decoratorpattern.coffeebar.decorator;

import cn.ncut.java.designpattern.decoratorpattern.coffeebar.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {
		super(Obj);
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
