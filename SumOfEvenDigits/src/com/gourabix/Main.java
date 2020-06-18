package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of the even digits in 252 is " + getEvenDigitSum(252) + ".");
        System.out.println("Sum of the even digits in -564 is " + getEvenDigitSum(-564) + ".");
        System.out.println("Sum of the even digits in 123456789 is " + getEvenDigitSum(123456789) + ".");
        System.out.println("Sum of the even digits in 4557 is " + getEvenDigitSum(4557) + ".");
        System.out.println("Sum of the even digits in 404 is " + getEvenDigitSum(404) + ".");
        System.out.println("Sum of the even digits in 2020 is " + getEvenDigitSum(2020) + ".");
        System.out.println("Sum of the even digits in 2002 is " + getEvenDigitSum(2002) + ".");
        System.out.println("Sum of the even digits in 2000 is " + getEvenDigitSum(2000) + ".");
    }

    // This method calculates of even digits in any number. Not the digits in an even place.
    // Example: 252 -> 2 + 2 = 4.
    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sumOfEvenDigits = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                sumOfEvenDigits += currentDigit;
            }
            number /= 10;
        }

        return sumOfEvenDigits;
    }
}
