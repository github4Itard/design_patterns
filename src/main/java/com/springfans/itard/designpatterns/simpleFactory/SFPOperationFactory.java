package com.springfans.itard.designpatterns.simpleFactory;

public class SFPOperationFactory {

    public static SFPOperation createOperation(String operate){
        SFPOperation operation = null;
        switch (operate){
            case "+":
                operation = new SFPOperationAdd();
                break;
            case "-":
                operation = new SFPOperationSub();
                break;
        }

        return operation;
    }
}
