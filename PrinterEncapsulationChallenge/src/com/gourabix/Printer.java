package com.gourabix;

public class Printer {

    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(double tonerLevel, boolean duplexPrinter) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = 50.0;
            System.out.println("Setting a default toner level of 50.0...");
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void setTonerLevel(double amount) {
        this.tonerLevel += amount;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void printPage() {
        System.out.println("A new page is printing...");
        pagesPrinted++;
        System.out.println("Total number of pages printed: " + pagesPrinted);
        setTonerLevel(-2.25);
    }

    public void printPage(int pages) {
        if (duplexPrinter) {
            System.out.println("Printing in duplex mode...");
            pages = pages / 2 + pages % 2;
            for (int i = 0; i < pages; i++) {
                printPage();
            }
        } else {
            System.out.println("Printing in simplex mode...");
            for (int i = 0; i < pages; i++) {
                printPage();
            }
        }
    }

    public void fillUpToner(double amount) {
        if (amount >= 0 && amount <= 100) {
            if (tonerLevel + amount > 100) {
                System.out.println("Too much toner amount to fill. Kindly fill a maximum of " + (100 - tonerLevel) + ".");
            } else {
                tonerLevel += amount;
                System.out.println("Toner levels have been filled up successfully by an amount: " + amount + ".");
            }
        } else {
            System.out.println("Invalid Toner amount: " + amount);
        }
    }

}
