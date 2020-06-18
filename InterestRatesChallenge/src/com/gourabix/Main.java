package com.gourabix;

public class Main {

    public static void main(String[] args) {
//        int[] rates = {2, 3, 4, 5, 6, 7, 8};
//        for (int i = 0; i < 7; i++) {
//            System.out.println("Interest for principal: " + 10000 + " and rate: " + rates[i] + "% is = " + calculateInterest(10000, rates[i]));
//        }

        for (int i = 2; i <= 8; i++) {
            System.out.println("Interest for principal: " + 10000 + " and rate: " + i + "% is = " + calculateInterest(10000.0, i));
        }

        System.out.println("-----------------------------------------------------------");

        for (int i = 8; i >=2; i--) {
            System.out.println("Interest for principal: " + 10000 + " and rate: " + i + "% is = " + calculateInterest(10000.0, i));
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return amount * rate / 100;
    }
}
