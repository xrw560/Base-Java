package cn.ncut.java.designpattern.templatepattern.hotdrink;

public class MainTest {

    public static void main(String[] args) {
//        HotDrink mCoffee = new Coffee();
//        HotDrink mTea = new Tea();
//        mCoffee.prepareRecipe();
//        mTea.prepareRecipe();

        TeaWithHook mTeaWithHook = new TeaWithHook();
        mTeaWithHook.prepareRecipe();

    }

} 