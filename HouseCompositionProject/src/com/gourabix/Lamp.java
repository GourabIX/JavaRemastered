package com.gourabix;

public class Lamp {

    private String colour;
    private String type;
    private int height;

    public Lamp(String colour, String type, int height) {
        this.colour = colour;
        this.type = type;
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void turnOnLights() {
        System.out.println("Lamp with light: " + getColour() + " of colour " + getColour() +
                " and height " + getHeight() + " is now turned on.");
    }

}
