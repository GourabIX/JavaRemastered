package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Is -1221 a palindrome number? " + isPalindrome(-1221));
        System.out.println("Is 707 a palindrome number? " + isPalindrome(707));
        System.out.println("Is 404 a palindrome number? " + isPalindrome(404));
        System.out.println("Is 11212 a palindrome number? " + isPalindrome(11212));
        System.out.println("Is 200 a palindrome number? " + isPalindrome(200));
        System.out.println("Is 201 a palindrome number? " + isPalindrome(201));
    }

    private static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = 0;
            lastDigit = number % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            number /= 10;
        }

        if (reversedNumber == originalNumber) {
            return true;
        } else {
            return false;
        }
    }
}
