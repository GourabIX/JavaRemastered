package com.gourabix;

public class Monitor {

    private String brand;
    private Resolution resolution;
    private int colorDensity;

    public Monitor(String brand, Resolution resolution, int colorDensity) {
        this.brand = brand;
        this.resolution = resolution;
        this.colorDensity = colorDensity;
    }

    public String getBrand() {
        return brand;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public int getColorDensity() {
        return colorDensity;
    }

    public void drawPixel(int width, int height, String colour) {
        System.out.println("Drawing pixel at width: " + width + " and height: " + height + " with colour: " + colour);
    }

}
