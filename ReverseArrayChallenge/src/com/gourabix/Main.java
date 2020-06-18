package com.gourabix;

/*
-Write a method called reverse() with an int array as a parameter.
-The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
-For example, if the array is {1, 2, 3, 4, 5, 6}, then the reversed array is {5, 4, 3, 2, 1}.

Tip:
	-Create a new console project with the name ReverseArrayChallenge
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arrayCapacity = 0;
        boolean userArraySaved = false;
        do {
            System.out.println("Enter the length of the array: ");
            if (scanner.hasNextInt()) {
                arrayCapacity = scanner.nextInt();
                userArraySaved = true;
            } else {
                System.out.println("Please, enter a correct integer number.");
            }
            scanner.nextLine();
        } while (!userArraySaved);

        int[] userArray = readIntegers(arrayCapacity);
        printArray(userArray, "User Array");
        int[] reversedArray = reverseArray(userArray);
        printArray(reversedArray, "Reversed User Array");

        System.out.println();

        int[] userArray1 = readIntegers(arrayCapacity);
        printArray(userArray1, "User Array 1");
        int[] reversedArray1 = reverseArrayAlt(userArray1);
        printArray(reversedArray1, "Reversed User Array 1");

    }

    public static int[] readIntegers(int count) {

        int [] numbersArray = new int[count];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                numbersArray[i] = scanner.nextInt();
            } else {
                System.out.println("Please, enter a correct integer.");
                i--;
            }
            scanner.nextLine();
        }

        return numbersArray;

    }

    public static void printArray(int[] array, String arrayName) {

        System.out.println("Here's the " + arrayName + " that you have entered: ");
        System.out.println(Arrays.toString(array));

    }

    public static int[] reverseArray(int[] array) {

        for (int i = 0, j = (array.length - 1); i < array.length / 2 && j >= array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;

    }

    public static int[] reverseArrayAlt(int[] array) {

        int maxIndex = array.length - 1;

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        return array;

    }

}
