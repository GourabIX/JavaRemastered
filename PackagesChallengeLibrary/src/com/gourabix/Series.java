package com.gourabix;

/*
 Create a suitably named package containing a class called Series
 with the following static methods:
 nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.

 factorial(int n) returns the product of all numbers from 1 to n
      i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
 The first 10 factorials are:
 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.

 fibonacci(n) returns the nth Fibonacci number. These are defined as:
 f(0) = 0
 f(1) = 1
 f(n) = f(n-1) + f(n-2)
 (so f(2) is also 1. The first 10 fibonacci numbers are:
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

 When you have tested your functions, delete the Main class and
 produce a jar file.

 Create a new project and add your Series library, then test the
 three methods in the main() method of your new project.
*/

public class Series {
    public static int nSum(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int nSumOptimised(int n) {
        return n * (n + 1) / 2;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }

        if (n <= 2 && n > -1) {
            return n;
        }

        if (n > 2) {
            return factorialRecursive(n - 1) * n;
        }

        return -1;
    }

    public static int factorialLoop(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        if (n >= 1) {
            for (int i = n; i >= 1; i--) {
                result *= i;
            }
            return result;
        }

        return -1;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        return -1;
    }

    public static int fibonacciLooped(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (n > 1) {
            int n1 = 0;
            int n2 = 1;
            int fibonacci = 0;
            for (int i = 1; i < n; i++) {
                fibonacci = n1 + n2;
                n1 = n2;
                n2 = fibonacci;
            }
            return fibonacci;
        }

        return -1;
    }
}
