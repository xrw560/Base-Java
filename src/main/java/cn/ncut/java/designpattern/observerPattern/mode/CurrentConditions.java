package cn.ncut.java.designpattern.observerPattern.mode;


import cn.ncut.java.designpattern.observerPattern.observer.Observer;

public class CurrentConditions implements Observer {

    private float mTemperature;
    private float mPressure;//气压
    private float mHumidity;//湿度

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mHumidity = mHumidity;
        this.mPressure = mPressure;
        this.mTemperature = mTemperature;
        display();
    }

    public void display() {
        System.out.println("***Today mTemperature:" + mTemperature + "***");
        System.out.println("***Today mPressure:" + mPressure + "***");
        System.out.println("***Today mHumidity:" + mHumidity + "***");
    }

}