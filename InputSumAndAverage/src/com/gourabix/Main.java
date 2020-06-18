package com.gourabix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, average = 0, numCount = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                sum += scanner.nextInt();
                numCount++;
            } else {
                break;
            }
        }
        scanner.close();

        if (numCount > 0) {
            average = (int) Math.round((double) sum / (double) numCount);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
