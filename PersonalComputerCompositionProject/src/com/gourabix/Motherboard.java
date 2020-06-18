package com.gourabix;

public class Motherboard {

    private String model;
    private int ramSlots;
    private int cardSlots;
    private String manufacturer;

    public Motherboard(String model, int ramSlots, int cardSlots, String manufacturer) {
        this.model = model;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void bootUp() {
        System.out.println("System is booting up.");
    }

}
