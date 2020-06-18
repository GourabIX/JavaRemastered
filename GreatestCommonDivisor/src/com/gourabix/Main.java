package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("GCD for numbers 12 and 24 is equal to " + getGreatestCommonDivisor(12, 24) + ".");
        System.out.println("GCD for numbers 25 and 15 is equal to " + getGreatestCommonDivisor(25, 15) + ".");
        System.out.println("GCD for numbers 12 and 30 is equal to " + getGreatestCommonDivisor(12, 30) + ".");
        System.out.println("GCD for numbers 9 and 18 is equal to " + getGreatestCommonDivisor(9, 18) + ".");
        System.out.println("GCD for numbers 81 and 153 is equal to " + getGreatestCommonDivisor(81, 153) + ".");
        System.out.println("GCD for numbers 48 and 144 is equal to " + getGreatestCommonDivisor(48, 144) + ".");
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) {
            return -1;
        }

        int maxDivisor = (num1 < num2) ? num1 : num2;

        for (int i = maxDivisor; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }

        return 1;
    }
}
