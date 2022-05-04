package com.zorba.aig.life.insurance.service;

public class NumberUtil {

    private Calculator calculator;

    public NumberUtil(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int sqaureofSum(int a, int b){
        return (calculator.add(a,b))*(calculator.add(a,b));
    }
}
