package com.gourabix;

public class Case {

    private String model;
    private String manufacturer;
    private Dimension caseDimensions;           // Composition: Case HAS-A Dimension.

    public Case(String model, String manufacturer, Dimension caseDimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.caseDimensions = caseDimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getCaseDimensions() {
        return caseDimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power Button Pressed.");
    }

}
