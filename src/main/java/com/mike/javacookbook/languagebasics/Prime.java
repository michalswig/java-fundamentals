package com.mike.javacookbook.languagebasics;

public class Prime {

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void displayPrimeFromOneToThousand() {
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) System.out.print(i + ", ");
        }
    }

}
