package com.gourabix;

public class Main {

    public static void main(String[] args) {

        Motherboard gaMotherboard = new Motherboard("GA B250M-DS3H", 4, 2, "Gigabyte");
        Monitor smMonitor = new Monitor("SM-960", "Samsung", new Resolution(1920, 1080), 97);
        Case cmCase = new Case("CM-1400", "Cooler Master", new Dimension(20, 20, 35));

        PC gourabPC = new PC(gaMotherboard, cmCase, smMonitor);
//        gourabPC.getTheCase().pressPowerButton();
//        gourabPC.getMotherboard().bootUp();
//        gourabPC.getMonitor().drawPixelAt(1024, 768, "Blue");
        gourabPC.powerUp();

    }
}
