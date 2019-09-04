package com.springfans.itard.designpatterns.strategy;

import com.springfans.itard.designpatterns.strategy.behavior.fly.FlywithWings;
import com.springfans.itard.designpatterns.strategy.duck.Duck;
import com.springfans.itard.designpatterns.strategy.duck.RubberDuck;

public class SPShowEntrance {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.setFlyHehavior(new FlywithWings());
        rubberDuck.quack();
        rubberDuck.fly();
    }
}
