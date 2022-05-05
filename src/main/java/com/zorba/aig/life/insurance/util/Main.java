package com.zorba.aig.life.insurance.util;

public class Main {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        AdvancedCalculator calculator = new AdvancedCalculator(basicCalculator);

        System.out.println(calculator.qubesum(10,5));
    }
}
