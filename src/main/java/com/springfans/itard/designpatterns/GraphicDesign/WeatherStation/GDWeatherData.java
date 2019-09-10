package com.springfans.itard.designpatterns.GraphicDesign.WeatherStation;

import java.util.Observable;

/**
 * @author Itard
 * @date 2019/9/9 13:43
 */
public class GDWeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 气象站更新值通知订阅者
     */
    public void measurementsChanged(){
        setChanged();
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

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
