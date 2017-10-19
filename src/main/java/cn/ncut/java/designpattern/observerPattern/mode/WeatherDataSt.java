package cn.ncut.java.designpattern.observerPattern.mode;

import cn.ncut.java.designpattern.observerPattern.observer.Observer;
import cn.ncut.java.designpattern.observerPattern.observer.Subject;

import java.util.ArrayList;

public class WeatherDataSt implements Subject {

    /**
     * 温度
     */
    private float mTemperature;
    /**
     * 气压
     */
    private float mPressure;
    /**
     * 湿度
     */
    private float mHumidity;
    private ArrayList<Observer> mObservers;

    public WeatherDataSt() {
        mObservers = new ArrayList<Observer>();
    }

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
        notifyObservers();
    }


    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (mObservers.contains(o)) {
            mObservers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0, len = mObservers.size(); i < len; i++) {
            //可扩展性差
            //可把参数传送过去
            //可以通知有改变，采用拉的方式拉去数据
            mObservers.get(i).update(getTemperature(), getPressure(), getHumidity());
        }
    }

}
