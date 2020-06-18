package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Do 43, 25 and 53 share the same last digit? " + hasSameLastDigit(43, 25, 53));
        System.out.println("Do 21, 27 and 53 share the same last digit? " + hasSameLastDigit(21, 27, 53));
        System.out.println("Do -8, 235 and 853 share the same last digit? " + hasSameLastDigit(-8, 235, 853));
        System.out.println("Do 57, 67 and 57 share the same last digit? " + hasSameLastDigit(57, 67, 57));
        System.out.println("Do 89, 109 and 539 share the same last digit? " + hasSameLastDigit(89, 109, 539));
        System.out.println("Do 12, 22 and 39 share the same last digit? " + hasSameLastDigit(12, 22, 39));
        System.out.println("Do 23, 32 and 42 share the same last digit? " + hasSameLastDigit(23, 32, 42));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;
        int lastDigitNum3 = num3 % 10;
        int sharedLastDigitCount = 0;

        if (lastDigitNum1 == lastDigitNum2) {
            sharedLastDigitCount++;
        }

        if (sharedLastDigitCount < 1) {
            if (lastDigitNum1 == lastDigitNum3) {
                sharedLastDigitCount++;
            }
        } else {
            return true;
        }

        if (sharedLastDigitCount < 1) {
            if (lastDigitNum2 == lastDigitNum3) {
                sharedLastDigitCount++;
            }
        } else {
            return true;
        }

        if (sharedLastDigitCount < 1) {
            return false;
        } else {
            return true;
        }
    }

//    public static boolean checkSharedLastDigitCount(int sharedLastDigitCount) {
//        if (sharedLastDigitCount >= 1) {
//            return true;
//        }
//        return false;
//    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
}
