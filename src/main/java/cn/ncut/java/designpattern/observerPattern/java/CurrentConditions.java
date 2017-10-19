package cn.ncut.java.designpattern.observerPattern.java;

import java.util.Observable;
import java.util.Observer;

import cn.ncut.java.designpattern.observerPattern.java.WeatherData.Data;

public class CurrentConditions implements Observer {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(Observable observable, Object obj) {
        this.mTemperature = ((Data) (obj)).mTemperature;
        this.mPressure = ((Data) (obj)).mPressure;
        this.mHumidity = ((Data) (obj)).mHumidity;
        display();
    }

    public void display() {
        System.out.println("***Today mTemperature:" + mTemperature + "***");
        System.out.println("***Today mPressure:" + mPressure + "***");
        System.out.println("***Today mHumidity:" + mHumidity + "***");
    }
}
