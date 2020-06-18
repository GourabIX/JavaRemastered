package com.gourabix;

public class Main {

    public static void main(String[] args) {
        char switchValue = 'z';

        switch(switchValue) {
            case 'a':
                System.out.println("a was typed.");
                break;
            case 'b':
                System.out.println("b was typed.");
                break;
            case 'c':
                System.out.println("c was typed.");
                break;
            case 'g':
                System.out.println("g was typed.");
                break;
            case 'd': case 'e': case 'f':
                System.out.println("Either d, e or f was typed.");
                System.out.println("Specifically, " + switchValue + " was typed.");
                break;
            default:
                System.out.println("Something other than a, b, c, d, e, f, or g was typed.");
                System.out.println("Actually, " + switchValue + " was typed instead.");
                break;
        }

        String month = "mAY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Happy Birthday, Dad!");
                break;
            case "may":
                System.out.println("Happy Birthday, Mom!");
                break;
            case "june":
                System.out.println("Happy Birthday, you!");
                break;
            default:
                System.out.println("Chillax! No birthday parties anywhere.");
                break;
        }
    }
}
