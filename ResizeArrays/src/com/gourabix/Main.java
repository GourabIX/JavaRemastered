package com.gourabix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = getArrayLengthFromUser();
        int[] userArray = readIntegersIntoArray(count);
        System.out.println("Here's the array you have entered: ");
        printArray(userArray);

        count = getArrayLengthFromUser();
        System.out.println("Updated Array Capacity to " + count + ".");
        userArray = resizeArray(userArray, count);
        System.out.println("Here's the resized array: ");
        printArray(userArray);

        scanner.close();

    }

    public static void printArray(int[] array) {

        System.out.println(Arrays.toString(array));

    }

    public static int[] readIntegersIntoArray(int capacity) {

        int[] userArray = new int[capacity];

        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                userArray[i] = scanner.nextInt();
            } else {
                System.out.println("Please, enter a correct integer number.");
                i--;
            }
            scanner.nextLine();
        }

        return userArray;

    }

    public static int[] resizeArray(int[] array, int resizeLength) {

        return Arrays.copyOf(array, resizeLength);

    }

    public static int getArrayLengthFromUser() {

        int count = 0;

        do {
            System.out.println("Enter how many integers you want to input: ");
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
            } else {
                System.out.println("Please, enter a positive integer count.");
            }
        } while (!(count > 0));

        return count;
    }

}
