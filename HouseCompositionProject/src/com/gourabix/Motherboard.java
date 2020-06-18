package com.gourabix;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private int usbPorts;
    private boolean supportsHDMI;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, int usbPorts, boolean supportsHDMI) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.usbPorts = usbPorts;
        this.supportsHDMI = supportsHDMI;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public boolean isSupportsHDMI() {
        return supportsHDMI;
    }

    public void bootUp() {
        System.out.println(getModel() + " from " + getManufacturer() + " is now booting up...");
    }

}
