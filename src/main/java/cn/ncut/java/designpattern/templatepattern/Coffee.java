package cn.ncut.java.designpattern.templatepattern;

public class Coffee {

    public void prepareRecipe() {
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarMilk();
    }

    public void brewCoffee() {
        System.out.println("Boiling water");
    }

    public void boilWater() {
        System.out.println("Brewing Coffee");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarMilk() {
        System.out.println("Add Sugar and  Milk");
    }
} 