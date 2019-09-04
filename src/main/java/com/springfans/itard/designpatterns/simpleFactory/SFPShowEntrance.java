package com.springfans.itard.designpatterns.simpleFactory;

public class SFPShowEntrance {
    public static void main(String[] args) {
        SFPOperation operation = SFPOperationFactory.createOperation("-");
        operation.setNumberA(1.9);
        operation.setNumberB(2.1);
        operation.getResultNumber();
    }
}
