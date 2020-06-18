package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Do 12 and 23 have shared digits? " + hasSharedDigit(12, 23));
        System.out.println("Do 9 and 99 have shared digits? " + hasSharedDigit(9, 99));
        System.out.println("Do 15 and 55 have shared digits? " + hasSharedDigit(15, 55));
        System.out.println("Do 12 and 13 have shared digits? " + hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (num1 > 0) {
            int currentDigitNum1 = num1 % 10;
            int num2Backup = num2;
            while (num2 > 0) {
                int currentDigitNum2 = num2 % 10;
                if (currentDigitNum1 == currentDigitNum2) {
                    return true;
                }
                num2 /= 10;
            }
            num1 /= 10;
            num2 = num2Backup;
        }

        return false;
    }
}
