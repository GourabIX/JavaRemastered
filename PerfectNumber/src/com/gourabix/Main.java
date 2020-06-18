package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Is 6 a perfect number? "+ isPerfectNumber(6));
        System.out.println("Is 28 a perfect number? "+ isPerfectNumber(28));
        System.out.println("Is 5 a perfect number? "+ isPerfectNumber(5));
        System.out.println("Is -5 a perfect number? "+ isPerfectNumber(-5));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sumProperPositiveDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumProperPositiveDivisors += i;
            }
        }

        if (sumProperPositiveDivisors == number) {
            return true;
        }

        return false;
    }
}
