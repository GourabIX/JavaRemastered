package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        return ((int) (n1 * 1000) == (int) (n2 * 1000)) ? true : false;             // parentheses is required. Not for visual purposes.
    }
}
