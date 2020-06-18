package com.gourabix;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println("---------------------------------");
        printSquareStar(8);
        System.out.println("---------------------------------");
        printSquareStar(12);
        System.out.println("---------------------------------");
        printSquareStar(25);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {             // considering rows
            for (int j = 0; j < number; j++) {         // considering columns
                /*
                    Criteria for printing Stars:
                    1. In the first or last row
                    2. In the first or last column
                    3. When the row number equals the column number
                    4. When the column number equals rowCount - currentRow
                 */
                if (i == 0 || i == number - 1 || i == j || j == (number - i - 1) || j == 0 || j == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
