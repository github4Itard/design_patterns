package com.springfans.itard.designpatterns.GraphicDesign.WeatherStation;

/**
 * 订阅者
 * @author Itard
 * @date 2019/8/26 20:46
 */
public interface Observer {
    /**
     * 气息状态值改变，主题传递值给订阅者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
