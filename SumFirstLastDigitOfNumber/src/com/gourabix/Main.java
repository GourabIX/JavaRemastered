package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of the first and last digits of 675 is " + sumFirstAndLastDigit(675) + ".");
        System.out.println("Sum of the first and last digits of 1225 is " + sumFirstAndLastDigit(1225) + ".");
        System.out.println("Sum of the first and last digits of 658 is " + sumFirstAndLastDigit(658) + ".");
        System.out.println("Sum of the first and last digits of 404 is " + sumFirstAndLastDigit(404) + ".");
        System.out.println("Sum of the first and last digits of 578 is " + sumFirstAndLastDigit(578) + ".");
        System.out.println("Sum of the first and last digits of -55 is " + sumFirstAndLastDigit(-55) + ".");
        System.out.println("Sum of the first and last digits of -2 is " + sumFirstAndLastDigit(-2) + ".");
        System.out.println("Sum of the first and last digits of 5 is " + sumFirstAndLastDigit(5) + ".");
        System.out.println("Sum of the first and last digits of 9 is " + sumFirstAndLastDigit(9) + ".");
        System.out.println("Sum of the first and last digits of 99 is " + sumFirstAndLastDigit(99) + ".");
        System.out.println("Sum of the first and last digits of 62 is " + sumFirstAndLastDigit(62) + ".");
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            return number * 2;
        }

        int sumOfFirstAndLastDigit = number % 10;

        while (number > 0) {
            int firstDigit = number % 10;
            number /= 10;
            if (number == 0) {
                sumOfFirstAndLastDigit += firstDigit;
            }
        }

        return sumOfFirstAndLastDigit;
    }
}
