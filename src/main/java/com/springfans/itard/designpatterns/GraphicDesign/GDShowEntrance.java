package com.springfans.itard.designpatterns.GraphicDesign;

import com.springfans.itard.designpatterns.GraphicDesign.BulletinBoard.CurrentCondtionsDisplay;
import com.springfans.itard.designpatterns.GraphicDesign.WeatherStation.WeatherData;

import java.util.Observer;

/**
 * @author Itard
 * @date 2019/8/26 21:19
 */
public class GDShowEntrance {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondtionsDisplay currentCondtionsDisplay = new CurrentCondtionsDisplay(weatherData);
        weatherData.setMeasurements(1.2f, 2.3f, 3.5f);
        weatherData.setMeasurements(2.2f, 2.3f, 3.5f);
        weatherData.setMeasurements(3.2f, 2.3f, 3.5f);
    }
}
