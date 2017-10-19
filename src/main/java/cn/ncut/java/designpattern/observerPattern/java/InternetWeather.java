package cn.ncut.java.designpattern.observerPattern.java;

/**
 * 使用Java内置观察者的注意点
 * （1）Observable是一个类，并不是接口，已经实现了添加，移除和通知；
 * （2）通知的两种方法都有，直接通知对象，将通知对象直接作为Object推送给观察者也可以只发送一个通知，然后让Observer来拉数据，推与拉都实现了，
 * （3）通知之前需要使用this.setChanged()设置一下，为了通知的过程中的灵活性
 */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions mCurrentConditions;
        ForecastConditions mForecastConditions;
        WeatherData mWeatherData;

        mCurrentConditions = new CurrentConditions();
        mForecastConditions = new ForecastConditions();
        mWeatherData = new WeatherData();

        //注册，通知顺序先进后出
        mWeatherData.addObserver(mCurrentConditions);
        mWeatherData.addObserver(mForecastConditions);
        mWeatherData.setData(30, 150, 40);

        //移除
        mWeatherData.deleteObserver(mCurrentConditions);
        System.out.println("------------移除mCurrentConditions-----------------");
        mWeatherData.setData(35, 150, 60);

    }
}
