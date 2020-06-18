package com.gourabix;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 15;
        short shortValue = 257;
        int intValue = 1565;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println("Here's the value of the longValue variable: " + longValue);

        short shortTotal = (short) (100 + 10 * (byteValue + shortValue + intValue));
        System.out.println("Value of shortTotal: " + shortTotal);
    }
}
