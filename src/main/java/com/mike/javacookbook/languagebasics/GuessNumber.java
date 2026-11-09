package com.mike.javacookbook.languagebasics;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void findThatNumber() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        System.out.println("Witaj w grze, naciśnij enter i wylosuj liczbę");
        scanner.nextLine();
        int result = random.nextInt(1000) + 1;
        System.out.println("Wylosowano sekretną liczbę (testowo pokazuję): " + result);
        Thread.sleep(1000);
        System.out.println("Teraz zgaduj, podaj liczbę i wcisnij enter");
        while (true) {
            count++;
            int userChoice = scanner.nextInt();
            if (userChoice == result) {
                System.out.println("Wygrałeś!, miałeś " + count + " prób, ta liczba to " + result);
                System.out.println("Do widzenia");
                break;
            } else if (userChoice > result) {
                System.out.println("Niestety za dużo!, próbuj ponownie");
            } else {
                System.out.println("Niestety za mało!, próbuj ponownie");
            }
        }
    }
}
