package com.gourabix;

public class Main {

    public static void main(String[] args) {

        int numberCount = 0;
        int sum = 0;
        for (int i = 1; (i <= 1000) && (numberCount < 5); i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by both 3 and 5.");
                sum += i;
                numberCount++;
            }
        }
        System.out.println("The sum of matched numbers is " + sum);
    }
}
