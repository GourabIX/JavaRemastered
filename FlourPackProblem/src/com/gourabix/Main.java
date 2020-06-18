package com.gourabix;

public class Main {

    public static void main(String[] args) {
        System.out.println("Can we pack 4 KGs of flour from 1 Big Bags and 0 Small Bags? " + canPack(1, 0, 4));
        System.out.println("Can we pack 4 KGs of flour from 3 Big Bags and 6 Small Bags? " + canPack(3, 6, 4));
        System.out.println("Can we pack 5 KGs of flour from 1 Big Bags and 0 Small Bags? " + canPack(1, 0, 5));
        System.out.println("Can we pack 11 KGs of flour from 2 Big Bags and 2 Small Bags? " + canPack(2, 2, 11));
        System.out.println("Can we pack 12 KGs of flour from -3 Big Bags and 2 Small Bags? " + canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        bigCount *= 5;

        if ((bigCount + smallCount) == goal) {
            return true;
        }

        if (bigCount == goal || smallCount == goal) {
            return true;
        }

        if ((bigCount + smallCount) > goal) {
            int usableBigCount = goal / 5;
            int usableSmallCount = 0;
            int remainingGoal = goal % 5;
            if (smallCount >= remainingGoal) {
                usableSmallCount = remainingGoal;
            }
            if (usableBigCount * 5 + usableSmallCount == goal) {
                return true;
            }
        }

        return false;
    }
}
