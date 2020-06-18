package com.gourabix;

public class Main {

    public static void main(String[] args) {
        numberToWords(143);
        numberToWords(100);
        numberToWords(404);
        numberToWords(1020);
        numberToWords(2020);
        numberToWords(2010);
        numberToWords(102400);
        numberToWords(127001);
        numberToWords(5);
        numberToWords(25);
        numberToWords(40);
        numberToWords(1054);
        numberToWords(-20);
        numberToWords(-4);
        numberToWords(0);
        numberToWords(9);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        boolean addZeroes = false;
        int zeroesToAdd = 0;

        int reversedNumber = reverse(number);
        if (getDigitCount(reversedNumber) != getDigitCount(number)) {
            addZeroes = true;
            zeroesToAdd = getDigitCount(number) - getDigitCount(reversedNumber);
        }
        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid Value");
                    break;
            }
            reversedNumber /= 10;
        }

        if (addZeroes) {
            for (int i = 0; i < zeroesToAdd; i++) {
                System.out.print("Zero ");
            }
        }

        System.out.println();
    }

    public static int reverse(int number) {
        int absoluteNumber = Math.abs(number);
        int reversedNumber = 0;
        while (absoluteNumber > 0) {
            int lastDigit = absoluteNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            absoluteNumber /= 10;
        }
        if (number < 0) {
            reversedNumber = -reversedNumber;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int digitCount = 0;
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
}
