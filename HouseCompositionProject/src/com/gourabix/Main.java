package com.gourabix;

public class Main {

    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("Gourab", new Wall(600, 150, 10),
                new Wall(650, 200, 10),
                new Wall(600, 150, 10),
                new Wall(650, 200, 10),
                new Table(30, 50, 3, "Sunmica", "White"),
                new Lamp("Yellow", "Smart LED", 5),
                new Ceiling(2500, "White"),
                new PersonalComputer(new Monitor("HP", new Resolution(1920, 1080), 994),
                    new Case("BN-670", "Cooler Master", "Black", new Dimension(10, 30, 25)),
                    new Motherboard("GA - B250M DS3H", "Gigabyte", 4, 2, 6, true)));

        bedroom.userEntrySequence();
        bedroom.closeDoors();
        bedroom.playLoudMusic();
    }

}
