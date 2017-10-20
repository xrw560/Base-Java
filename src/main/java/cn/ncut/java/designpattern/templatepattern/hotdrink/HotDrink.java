package cn.ncut.java.designpattern.templatepattern.hotdrink;

public abstract class HotDrink {

    /**
     * 步骤
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    public final void boilWater() {
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void addCondiments();

} 