package com.zorba.aig.life.insurance.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScintificCalculator {


    private BasicCalculator calculator;

    @Autowired
    public void setCalculator(BasicCalculator calculator) {
        this.calculator = calculator;
    }

    public int squareSum(int a , int b){
        return calculator.add(a,b)* calculator.add(a,b);
    }
}
