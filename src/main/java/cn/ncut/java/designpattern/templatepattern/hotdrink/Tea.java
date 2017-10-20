package cn.ncut.java.designpattern.templatepattern.hotdrink;

public class Tea extends HotDrink {
    @Override
    public void brew() {
        System.out.println("Brewing Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}