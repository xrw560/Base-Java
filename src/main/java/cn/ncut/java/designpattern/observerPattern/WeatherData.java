package cn.ncut.java.designpattern.observerPattern;

public class WeatherData {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    private CurrentConditions mCurrentConditions;

    public WeatherData(CurrentConditions mCurrentConditions) {
        this.mCurrentConditions = mCurrentConditions;
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
        mCurrentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

}
