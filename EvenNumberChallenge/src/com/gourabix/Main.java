package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Is 9675 an even number? " + isEvenNumber(9675));
        System.out.println("Is 5678 an even number? " + isEvenNumber(5678));

        int number = 1;
        int finishNumber = 100;
        int evenCount = 0;

        while (number <= finishNumber && evenCount < 5) {
            if (isEvenNumber(number)) {
                System.out.println(number);
                evenCount++;
            }

            number++;
        }

        System.out.println("Total number of even numbers found: " + evenCount + ".");
    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
