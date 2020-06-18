package com.gourabix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int numCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (numCount != 10) {
            System.out.println("Enter number #" + (numCount + 1) + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                numCount++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();         // handle end-of-line-character (Enter key)
        }
        scanner.close();

        System.out.println("The sum of the 10 entered numbers is equal to " + sum + ".");
    }
}
