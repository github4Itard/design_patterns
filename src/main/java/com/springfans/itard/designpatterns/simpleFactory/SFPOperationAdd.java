package com.springfans.itard.designpatterns.simpleFactory;

public class SFPOperationAdd extends SFPOperation {

    @Override
    public Double getResultNumber(){
        this.resultNumber = this.numberA + this.numberB;
        return this.resultNumber;
    }
}
