package com.springfans.itard.designpatterns.GraphicDesign.BulletinBoard;

import com.springfans.itard.designpatterns.GraphicDesign.WeatherStation.DisplayElement;
import com.springfans.itard.designpatterns.GraphicDesign.WeatherStation.GDWeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Itard
 * @date 2019/9/9 13:44
 */
public class GDCurrentCondtionDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public GDCurrentCondtionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof GDWeatherData) {
            this.humidity = ((GDWeatherData) o).getHumidity();
            this.pressure = ((GDWeatherData) o).getPressure();
            this.temperature = ((GDWeatherData) o).getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("GD:temperature is" + this.temperature + "; pressure is " + this.pressure);
    }
}
