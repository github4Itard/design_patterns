package com.springfans.itard.designpatterns.strategy.duck;

import com.springfans.itard.designpatterns.strategy.behavior.fly.FlyLikeRocket;
import com.springfans.itard.designpatterns.strategy.behavior.quack.QuackGaGa;

public class RubberDuck extends Duck {
    public RubberDuck() {
        System.out.println("我是一只橡皮鸭");
        flyHehavior = new FlyLikeRocket();
        quackHehavior = new QuackGaGa();
    }
}
