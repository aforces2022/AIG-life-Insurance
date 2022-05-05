package com.zorba.aig.life.insurance.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdvancedCalculator {


    private BasicCalculator calculator;

    @Autowired
    public AdvancedCalculator(BasicCalculator basicCalculator){
        this.calculator = basicCalculator;
    }

    public int qubesum(int a, int b){
        return calculator.add(a,b)*calculator.add(a,b)*calculator.add(a,b);
    }
}
