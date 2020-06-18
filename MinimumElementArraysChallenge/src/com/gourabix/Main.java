package com.gourabix;

/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name "MinElementChallenge"

 */

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;
        boolean countSaved = false;
        do {
            System.out.println("Enter how many numbers you want to enter: ");
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                countSaved = true;
            } else {
                System.out.println("Please, enter a correct integer count.");
            }
            scanner.nextLine();
        } while (!countSaved);

        int[] userNumbers = readIntegers(count);
        printArray(userNumbers);
        System.out.println("The minimum number present in the array is " + findMin(userNumbers) + ".");
        System.out.println("The minimum number present in the array through the alt method is "
                + findMinAlt(userNumbers) + ".");

    }

    public static int[] readIntegers(int capacity) {

        int[] numbersArray = new int[capacity];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                numbersArray[i] = scanner.nextInt();
            } else {
                System.out.println("Please, enter a correct integer value.");
                i--;
            }
            scanner.nextLine();
        }

        scanner.close();
        return numbersArray;

    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Number at position " + (i + 1) + " is " + array[i] + ".");
        }

    }

    public static int findMin(int[] array) {

        // sort the array in descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // return the last index, which will be the minimum number after sorting
        return array[array.length - 1];

    }

    public static int findMinAlt(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;

    }

}
