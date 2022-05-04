package com.zorba.aig.life.insurance.service;

public class TestCal {
    public static void main(String[] args) {
       /* Calculator calculator = new Calculator();
        UtilService service = new UtilService(calculator);
        //service.setCalculator(calculator);
        NumberUtil numberUtil = new NumberUtil(calculator);
        //service.setCalculator(calculator);

        System.out.println(service.avg(10,5));
        System.out.println(numberUtil.sqaureofSum(5,6));*/

        SciCalculator calculator = SciCalculator.getInstance();
        SciCalculator calculator1 = SciCalculator.getInstance();

        System.out.println(calculator.hashCode());
        System.out.println(calculator1.hashCode());

    }
}
