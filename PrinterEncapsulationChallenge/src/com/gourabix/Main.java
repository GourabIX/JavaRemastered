package com.gourabix;

public class Main {

    public static void main(String[] args) {

        Printer duplexPrinter = new Printer(47.5, true);
        duplexPrinter.printPage();

        Printer simplexPrinter = new Printer(75.0, false);
        simplexPrinter.printPage();

        duplexPrinter.fillUpToner(32.5);
        simplexPrinter.fillUpToner(35.0);
        simplexPrinter.fillUpToner(25.0);

        System.out.println("Current Toner Level of duplex printer: " + duplexPrinter.getTonerLevel());
        System.out.println("Current Toner Level of simplex printer: " + simplexPrinter.getTonerLevel());

        duplexPrinter.printPage();
        duplexPrinter.printPage();
        duplexPrinter.printPage();
        duplexPrinter.printPage(7);

        System.out.println("Current Toner Level of duplex printer: " + duplexPrinter.getTonerLevel());
        System.out.println("Current Toner Level of simplex printer: " + simplexPrinter.getTonerLevel());

    }
}
