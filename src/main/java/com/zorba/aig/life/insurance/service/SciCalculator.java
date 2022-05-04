package com.zorba.aig.life.insurance.service;

public class SciCalculator {

    private static SciCalculator calculator;

    private SciCalculator(){

    }

    public static SciCalculator getInstance(){

        if(calculator == null){
            calculator = new SciCalculator();
        }
        return calculator;
    }

}
