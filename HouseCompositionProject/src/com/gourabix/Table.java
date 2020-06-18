package com.gourabix;

public class Table {

    private int length;
    private int height;
    private int drawers;
    private String surfaceMaterial;
    private String colour;

    public Table(int length, int height, int drawers, String surfaceMaterial, String colour) {
        this.length = length;
        this.height = height;
        this.drawers = drawers;
        this.surfaceMaterial = surfaceMaterial;
        this.colour = colour;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getDrawers() {
        return drawers;
    }

    public String getSurfaceMaterial() {
        return surfaceMaterial;
    }

    public String getColour() {
        return colour;
    }

    public void lightUp() {
        System.out.println("Table is lighting up.");
    }

}
