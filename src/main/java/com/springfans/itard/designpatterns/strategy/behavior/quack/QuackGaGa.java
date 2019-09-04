package com.springfans.itard.designpatterns.strategy.behavior.quack;

public class QuackGaGa implements QuackHehavior{
    @Override
    public void performQuack() {
        System.out.println("我会嘎嘎叫");
    }
}
