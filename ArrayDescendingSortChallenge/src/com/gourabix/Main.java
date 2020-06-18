package com.gourabix;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbersArray = getIntegers(5);
        System.out.println();
        System.out.println("Here's the numbers that you have entered, in order: ");
        printArray(numbersArray);
        System.out.println();
        System.out.println("Here's the numbers you have entered, sorted in descending order: ");
        printArray(sortArray(numbersArray));

    }

    public static int[] getIntegers(int howManyNumbers) {

        int[] myNumbers = new int[howManyNumbers];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                myNumbers[i] = scanner.nextInt();
            } else {
                System.out.println("Please enter a correct integer.");
                i--;
            }
            scanner.nextLine();             // handle enter key input
        }

        return myNumbers;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number at position " + (i + 1) + " is: " + array[i] + ".");
        }
    }

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
