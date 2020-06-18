package com.gourabix;

import java.awt.geom.FlatteningPathIterator;

public class Main {

    public static void main(String[] args) {
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Number: " + minIntValue);
        System.out.println("Maximum Integer Number: " + maxIntValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value: " + minByteValue);
        System.out.println("Maximum Byte Value: " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value: " + minShortValue);
        System.out.println("Maximum Short Value: " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value: " + minLongValue);
        System.out.println("Maximum Long Value: " + maxLongValue);

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float Value: " + minFloatValue);
        System.out.println("Maximum Float Value: " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double Value: " + minDoubleValue);
        System.out.println("Maximum Double Value: " + maxDoubleValue);
        System.out.println("---------------------------------------------------------");

        // Overflow and Underflow in Java
        System.out.println("Overflow and Underflow by 1: ");
        System.out.println("Integer Overflow: " + (maxIntValue + 1));
        System.out.println("Integer Underflow: " + (minIntValue - 1));
        System.out.println("Byte Overflow: " + (maxByteValue + 1));       // won't actually work because result of any parentheses is an int.
        System.out.println("Byte Underflow: " + (minByteValue - 1));      // since byte fits easily to an int, the byte value gets incremented past its max. range.
        System.out.println("Short Overflow: " + (maxShortValue + 1));     // same goes for short. Also fits into an int.
        System.out.println("Short Underflow: " + (minShortValue - 1));
        System.out.println("Long Overflow: " + (maxLongValue + 1));
        System.out.println("Long Underflow: " + (minLongValue - 1));
        System.out.println("---------------------------------------------------------");

        System.out.println("Overflow and Underflow by 3: ");
        System.out.println("Integer Overflow: " + (maxIntValue + 3));
        System.out.println("Integer Underflow: " + (minIntValue - 3));
        System.out.println("Byte Overflow: " + (maxByteValue + 3));
        System.out.println("Byte Underflow: " + (minByteValue - 3));
        System.out.println("Short Overflow: " + (maxShortValue + 3));
        System.out.println("Short Underflow: " + (minShortValue - 3));
        System.out.println("Long Overflow: " + (maxLongValue + 3));
        System.out.println("Long Underflow: " + (minLongValue - 3));
        System.out.println("---------------------------------------------------------");

        long myLongLiteralValue = 5956595654L;      // 'L' at the end forces Java to treat the variable as 'long' type. Otherwise, it is also treated as an 'int'.
        System.out.println("Custom Literal Long Value: " + myLongLiteralValue);

        // Casting in Java
        int myIntValue = (maxIntValue / 2);
        System.out.println("Custom int value: " + myIntValue);

        byte myByteValue = (byte) (maxByteValue / 2);       // Calculation result of any parentheses expression is an int. So casting to 'byte' is required.
                                                            // Since byte is smaller than int, an int result does not fit into a byte type variable.
        System.out.println("Custom byte value: " + myByteValue);

        short myShortValue = (short) (maxShortValue / 2);
        System.out.println("Custom short value: " + myShortValue);

        long myLongValue = (maxLongValue / 2);
        System.out.println("Custom Long Value: " + myLongValue);

        float myFloatValue = (float) 5.25;          // Casting is required because double (default data type for floating-point numbers) can't fit into a float.
        float alsoFloatValue = 5.25f;               // Alternative way without float.
        System.out.println("Custom float value: " + myFloatValue);
        System.out.println("Another custom float value: " + alsoFloatValue);

        float anotherFloatValue = 5f / 3f;
        System.out.println("Another float value: " + anotherFloatValue);

        double anotherDoubleValue = 5d / 3d;
        System.out.println("Another double value: " + anotherDoubleValue);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';      // This is a unicode representation of the character 'D'.
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myAtChar = '\u0040';
        char myCopyrightChar = '\u00A9';
        System.out.println(myAtChar);
        System.out.println(myCopyrightChar);

        boolean isAmphanWreakingHavoc = true;
        boolean areYouARobot = true;
        boolean canItRunCryisRemastered = false;
        System.out.println("Is the super-cyclone Amphan wreaking Havoc? " + isAmphanWreakingHavoc);
        System.out.println("Are you a robot? " + areYouARobot);
        System.out.println("Can It Run Crysis ReMaStErEd? " + canItRunCryisRemastered);
    }
}
