package com.gourabix;

public class Main {

    public static void main(String[] args) {
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double anotherDouble = (myFirstDouble + mySecondDouble) * 100.00d;

        boolean isDivisible = (anotherDouble % 40.00d == 0) ? true : false;
        System.out.println("Is anotherDouble completely divisible? " + isDivisible);

        if (!isDivisible) {
            System.out.println("Got some remainder!");
        }
    }
}
