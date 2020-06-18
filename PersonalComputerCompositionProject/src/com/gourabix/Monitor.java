package com.gourabix;

public class Monitor {

    private String model;
    private String manufacturer;
    private Resolution nativeResolution;           // Composition: Monitor HAS-A Resolution.
    private double colourAccuracy;

    public Monitor(String model, String manufacturer, Resolution nativeResolution, double colourAccuracy) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
        this.colourAccuracy = colourAccuracy;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public double getColourAccuracy() {
        return colourAccuracy;
    }

    public void drawPixelAt(int width, int height, String colour) {
        System.out.println("Monitor is drawing pixels at (" + width + ", " + height + ") in colour: " + colour + ".");
    }

}
