package com.springfans.itard.designpatterns.strategy.duck;

import com.springfans.itard.designpatterns.strategy.behavior.fly.FlyHehavior;
import com.springfans.itard.designpatterns.strategy.behavior.quack.QuackHehavior;

public class Duck {
    QuackHehavior quackHehavior;
    FlyHehavior flyHehavior;

    public Duck(){
        System.out.println("冲鸭");
    }

    public void fly(){
        flyHehavior.performFly();
    }

    public void quack(){
        quackHehavior.performQuack();
    }

    public void setFlyHehavior(FlyHehavior flyHehavior){
        this.flyHehavior = flyHehavior;
    }

    public void setQuackHehavior(QuackHehavior quackHehavior){
        this.quackHehavior = quackHehavior;
    }

}
