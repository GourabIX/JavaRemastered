package com.gourabix;

public class Case {

    private String model;
    private String manufacturer;
    private String color;
    private Dimension dimension;

    public Case(String model, String manufacturer, String color, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.dimension = dimension;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void powerButtonPressed() {
        System.out.println("Case Power Button Pressed.");
    }

}
