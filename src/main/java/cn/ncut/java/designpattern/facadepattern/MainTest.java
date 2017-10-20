package cn.ncut.java.designpattern.facadepattern;

import cn.ncut.java.designpattern.facadepattern.hometheater.HomeTheaterFacade;

public class MainTest {
    public static void main(String[] args) {
        HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
}
