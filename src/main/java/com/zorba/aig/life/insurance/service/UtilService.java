package com.zorba.aig.life.insurance.service;

public class UtilService {

    private Calculator calculator;

    public UtilService(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public double avg(int a, int b){
        return calculator.add(a,b)/2;
    }

    public int doubleSum(int a, int b){
        return calculator.add(a,b)*2;
    }
}
