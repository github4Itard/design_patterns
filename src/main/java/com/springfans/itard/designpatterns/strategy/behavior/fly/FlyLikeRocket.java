package com.springfans.itard.designpatterns.strategy.behavior.fly;

public class FlyLikeRocket implements FlyHehavior {

    @Override
    public void performFly() {
        System.out.println("像火箭一样飞呀飞");
    }
}
