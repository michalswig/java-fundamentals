package com.mike.javacookbook.languagebasics;

public class Factorial {

    public static int countFactorial(int n){
        if(n < 0){
            System.out.println("enter non-negative integer");
        }
        int result = 1;
        for(int i = 0; i < n; i++){
            result *= (i + 1);
        }
        System.out.println("factorial" + " of " + n + " is " + result);
        return result;
    }

}
