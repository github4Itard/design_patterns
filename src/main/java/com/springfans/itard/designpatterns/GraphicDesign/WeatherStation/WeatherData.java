package com.springfans.itard.designpatterns.GraphicDesign.WeatherStation;

import java.util.ArrayList;

/**
 * @author Itard
 * @date 2019/8/26 20:42
 */
public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 气象站更新值通知订阅者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * 测试布告板，留个后门
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
