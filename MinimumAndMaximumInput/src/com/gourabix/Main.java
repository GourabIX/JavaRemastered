package com.gourabix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max = 0, min = 0;
        boolean firstRun = true;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (firstRun) {
                    max = number;
                    min = number;
                    firstRun = false;
                }
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
        System.out.println("The maximum entered number is " + max + " and the minimum entered number is " + min + ".");
    }
}
