package com.gourabix;

public class Main {

    public static void main(String[] args) {
        printFactors(32);
        System.out.println("-------------------------------------");
        printFactors(64);
        System.out.println("-------------------------------------");
        printFactors(8);
        System.out.println("-------------------------------------");
        printFactors(89);
        System.out.println("-------------------------------------");
        printFactors(91);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
