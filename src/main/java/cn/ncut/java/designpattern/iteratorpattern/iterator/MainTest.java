package cn.ncut.java.designpattern.iteratorpattern.iterator;

public class MainTest {
    public static void main(String[] args) {
        Waitress mWaitress = new Waitress();
        CakeHouseMenu mCakeHouseMenu = new CakeHouseMenu();
        DinerMenu mDinerMenu = new DinerMenu();

        mWaitress.addIterator(mCakeHouseMenu.getIterator());
        mWaitress.addIterator(mDinerMenu.getIterator());
        mWaitress.printMenu();
    }
}
