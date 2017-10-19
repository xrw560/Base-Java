package cn.ncut.java.designpattern.observerPattern.java;

import java.util.Observable;

public class WeatherData extends Observable {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public float getTemperature() {
        return mTemperature;
    }

    public float getPressure() {
        return mPressure;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public void dataChange() {
        // 设置变化，通知观察者数据有变化，可以设置通知条件，提高灵活性
        this.setChanged();
        //把数据推送给观察者
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public class Data {
        public float mTemperature;
        public float mPressure;
        public float mHumidity;

        public Data(float mTemperature, float mPressure, float mHumidity) {
            this.mTemperature = mTemperature;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }

}
