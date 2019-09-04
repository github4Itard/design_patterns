package com.springfans.itard.designpatterns.GraphicDesign.BulletinBoard;

import com.springfans.itard.designpatterns.GraphicDesign.WeatherStation.DisplayElement;
import com.springfans.itard.designpatterns.GraphicDesign.WeatherStation.Observer;
import com.springfans.itard.designpatterns.GraphicDesign.WeatherStation.Subject;

/**
 * @author Itard
 * @date 2019/8/26 20:43
 */
public class CurrentCondtionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentCondtionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("气象数据……temp:" + temp + "……humidity:" + humidity + "pressure:" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
