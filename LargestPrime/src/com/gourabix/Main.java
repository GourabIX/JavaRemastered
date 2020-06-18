package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("The largest prime factor of 21 is " + getLargestPrime(21) + ".");
        System.out.println("The largest prime factor of 217 is " + getLargestPrime(217) + ".");
        System.out.println("The largest prime factor of 0 is " + getLargestPrime(0) + ".");
        System.out.println("The largest prime factor of 45 is " + getLargestPrime(45) + ".");
        System.out.println("The largest prime factor of 36 is " + getLargestPrime(36) + ".");
        System.out.println("The largest prime factor of -6 is " + getLargestPrime(-6) + ".");
        System.out.println("The largest prime factor of 997 is " + getLargestPrime(997) + ".");
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrimeFactor = 0;

        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                if (number % i == 0 && i > largestPrimeFactor) {
                    largestPrimeFactor = i;
                }
            }
        }

        if (largestPrimeFactor > 0) {
            return largestPrimeFactor;
        } else {
            return -1;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
