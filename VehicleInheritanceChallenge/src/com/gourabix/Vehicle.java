package com.gourabix;

public class Vehicle {

    private int light;
    private int tyre;
    private String engine;
    private int brake;

    protected static final String UNKNOWN_VALUE = "unknown";

    public Vehicle() {
        this(0, 0, "unknown", 0);
    }

    public Vehicle(int light, int tyre, String engine, int brake) {
        this.light = light;
        this.tyre = tyre;
        this.engine = engine;
        this.brake = brake;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public int getLight() {
        return light;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public int getTyre() {
        return tyre;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }

    public int getBrake() {
        return brake;
    }

    public void steering(String direction) {
        System.out.println("Vehicle is being steered to the " + direction + ".");
    }

    public void moving(int speed) {
        System.out.println("Vehicle is moving at a speed of " + speed + " kmph.");
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }

}
