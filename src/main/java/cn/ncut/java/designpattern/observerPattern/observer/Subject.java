package cn.ncut.java.designpattern.observerPattern.observer;

public interface Subject {
    /**
     * 注册
     */
    public void registerObserver(Observer observer);

    /**
     * 移除
     */
    public void removeObserver(Observer observer);

    /**
     * 通知
     */
    public void notifyObservers();
}
