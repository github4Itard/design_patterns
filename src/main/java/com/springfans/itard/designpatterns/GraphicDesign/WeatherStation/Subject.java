package com.springfans.itard.designpatterns.GraphicDesign.WeatherStation;

/**
 * @author Itard
 * @date 2019/8/26 20:44
 */
public interface Subject {
    /**
     * 订阅
     */
    public void registerObserver(Observer observer);

    /**
     * 取消订阅
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有订阅用户
     */
    public void notifyObservers();

}
