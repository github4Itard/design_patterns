package com.springfans.itard.designpatterns.strategy.behavior.quack;

public class QuackGuaGua implements QuackHehavior{
    @Override
    public void performQuack() {
        System.out.println("我会呱呱叫");
    }
}
