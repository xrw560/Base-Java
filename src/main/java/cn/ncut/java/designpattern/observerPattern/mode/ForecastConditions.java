package cn.ncut.java.designpattern.observerPattern.mode;

import cn.ncut.java.designpattern.observerPattern.observer.Observer;

public class ForecastConditions implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;

        display();
    }

    public void display() {
        System.out.println("**明天温度:" + (mTemperature + Math.random()) + "**");
        System.out.println("**明天气压:" + (mPressure + 10 * Math.random()) + "**");
        System.out.println("**明天湿度:" + (mHumidity + Math.random()) + "**");
    }
}
