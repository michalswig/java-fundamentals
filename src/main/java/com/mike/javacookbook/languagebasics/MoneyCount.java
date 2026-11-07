package com.mike.javacookbook.languagebasics;

import java.math.BigDecimal;

public class MoneyCount {

    public static double addTwoNumbers(double a, double b) {
        System.out.println();
        return a + b;
    }

    public static BigDecimal addTwoNumbersBigDecimalReturn(double a, double b){
        System.out.println();
        return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
    }



}
