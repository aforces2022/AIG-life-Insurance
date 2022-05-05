package com.zorba.aig.life.insurance.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinaryCalculator {

    @Autowired
    private BasicCalculator calculator;

    public void printValue(int a, int b){
        System.out.println(" a :"+a+" b: "+b);
    }


}
