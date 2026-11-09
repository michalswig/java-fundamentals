package com.mike.javacookbook.languagebasics;

public class Overload {
    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static int sum(int... nums){
        int total = 0;
        for(int x: nums){
            total += x;
        }
        return total;
    }
}
