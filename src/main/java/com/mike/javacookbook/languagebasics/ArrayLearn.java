package com.mike.javacookbook.languagebasics;

public class ArrayLearn {

    public static void swap(int[] tab, int i, int j) {
        if (tab == null) {
            throw new NullPointerException("tab must not be null");
        }
        if (i < 0 || j < 0) {
            throw new IndexOutOfBoundsException("array indexes should be >= 0, but got i = /{i}, j = /{j}");
        }
        if (i > tab.length - 1 || j > tab.length - 1) {
            throw new IndexOutOfBoundsException("array indexes should be smaller than array's length");
        }
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

//    TODO Javadoc z opisem kontraktu - co rzuca i kiedy
//    Objects.checkIndex ?
//    Objects.requireNonNull(tab, "tab must not be null")

    public static void swapInteger(Integer i, Integer j) {
        Integer temp = i;
        i = j;
        j = temp;
    }

    public static void reverse(int[] tab) {
        if (tab == null) {
            throw new NullPointerException("tab must not be null");
        }
        for (int i = 0; i < tab.length / 2; i++) {
            int j = tab.length - 1 - i;
            int temp = tab[i];
            tab[i] = tab[j - i];
            tab[j - i] = temp;
        }
//        TODO złożoność czasowa tego,ile iteracji dla n elementów i ile dodatkowej pamięci?
    }

    public static int findSecondLargest(int[] tab) {
        int largest = Integer.MIN_VALUE;
        int second = 0;
        for (int x : tab) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }
        return second;
    }
}
