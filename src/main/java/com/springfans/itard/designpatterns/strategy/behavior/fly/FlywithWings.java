package com.springfans.itard.designpatterns.strategy.behavior.fly;

public class FlywithWings implements FlyHehavior {

    @Override
    public void performFly() {
        System.out.println("我有一对小翅膀，我飞呀飞呀飞");
    }
}
