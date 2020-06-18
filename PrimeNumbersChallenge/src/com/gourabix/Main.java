package com.gourabix;

public class Main {

    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 0; (i < 101) && (primeCount < 3); i++) {
            if (isPrime(i)) {
                primeCount++;
//                if (primeCount == 3) {
//                    break;
//                }
            }
            System.out.println("Is " + i + " a Prime Number? " + isPrime(i));
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
