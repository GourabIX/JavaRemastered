package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digits of the number 125 is " + getSumOfDigits(125) + ".");
        System.out.println("Sum of digits of the number -985 is " + getSumOfDigits(-985) + ".");
        System.out.println("Sum of digits of the number 857469 is " + getSumOfDigits(857469) + ".");
        System.out.println("Sum of digits of the number 5 is " + getSumOfDigits(5) + ".");
        System.out.println("Sum of digits of the number 458 is " + getSumOfDigits(458) + ".");
        System.out.println("Sum of digits of the number 34139 is " + getSumOfDigits(34139) + ".");
    }

    public static int getSumOfDigits(int number) {
        if (number <= 9) {
            return -1;
        }
        int sumOfDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        return  sumOfDigits;
    }
}
