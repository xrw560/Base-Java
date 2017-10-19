package cn.ncut.java.designpattern.observerPattern.java;

import java.util.Observable;
import java.util.Observer;

import cn.ncut.java.designpattern.observerPattern.java.WeatherData.Data;


public class ForecastConditions implements Observer {

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
        System.out.println("***Tomorrow mTemperature:" + (mTemperature + 1) + "***");
        System.out.println("***Tomorrow mPressure:" + (mPressure + 1) + "***");
        System.out.println("***Tomorrow mHumidity:" + (mHumidity + 1) + "***");
    }


}
