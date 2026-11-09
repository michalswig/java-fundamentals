package com.mike.javacookbook.languagebasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FizzBuzz {

    public static void displayFizzBuzzFromOneToOneHundredUsingIfElse() {
        Logger log = LoggerFactory.getLogger(FizzBuzz.class);
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 5 == 0) log.info("FizzBuzz");
            if (i % 3 == 0) log.info("Fizz");
            else if (i % 5 == 0) log.info("Buzz");
            else log.info(String.valueOf(i));
        }
    }

    public static void displayFizzBuzzFromOneToOneHundredUsingSwitch() {
        //TODO
    }



}
