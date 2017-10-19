package cn.ncut.java.designpattern.observerPattern.mode;

/**
 * 观察者模式：对象之间多对一依赖的一种设计方案，
 * 被依赖的对象为Subject，依赖的对象为Observer，Subject通知Observer变化
 */
public class InternetWeather {

    public static void main(String[] args) {

        CurrentConditions mCurrentConditions;
        ForecastConditions mForecastConditions;

        WeatherDataSt mWeatherDataSt;

        mWeatherDataSt = new WeatherDataSt();

        mCurrentConditions = new CurrentConditions();
        mForecastConditions = new ForecastConditions();

        //注册观察者
        mWeatherDataSt.registerObserver(mCurrentConditions);
        mWeatherDataSt.registerObserver(mForecastConditions);

        mWeatherDataSt.setData(30, 150, 40);
        mWeatherDataSt.removeObserver(mCurrentConditions);
        System.out.println("--------------移除mCurrentConditions--------------");
        mWeatherDataSt.setData(40, 250, 50);
    }

}
