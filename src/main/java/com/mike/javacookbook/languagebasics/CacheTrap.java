package com.mike.javacookbook.languagebasics;

public class CacheTrap {

    public static void showDifference() {
        Integer a1 = 127;
        Integer a2 = 127;
        System.out.println("a1 == a2 " + (a1 == a2));
        System.out.println("a1.equals(a2) " + (a1.equals(a2)));

        Integer b1 = 128;
        Integer b2 = 128;
        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1.equals(b2) " + (b1.equals(b2)));
        System.out.println("JVM domyślnie współdzieli te same instancje obiektów Integer dla wartości z zakresu od -128 do 127");

    }

}
