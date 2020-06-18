package com.gourabix;

public class Car extends Vehicle {

    private boolean windShield;
    private String emissionStandard;
    private int gears;
    private String carClass;

    public Car(int light, int tyre, String engine, int brake, boolean windShield, String emissionStandard, int gears, String carClass) {
        super(light, tyre, engine, brake);
        this.windShield = windShield;
        this.emissionStandard = emissionStandard;
        this.gears = gears;
        this.carClass = carClass;
    }

    public Car(int light, int tyre, String engine, int brake) {
        this(light, tyre, engine, brake, false, UNKNOWN_VALUE, 0, UNKNOWN_VALUE);
    }

    public Car(boolean windShield, String emissionStandard, int gears, String carClass) {
        this(0, 0, UNKNOWN_VALUE, 0, windShield, emissionStandard, gears, carClass);
    }

    public Car() {
        this(0, 0, UNKNOWN_VALUE, 0,false, UNKNOWN_VALUE, 0, UNKNOWN_VALUE);
    }

    public void setWindShield(boolean windShield) {
        this.windShield = windShield;
    }

    public boolean getWindShield() {
        return windShield;
    }

    public void setEmissionStandard(String emissionStandard) {
        this.emissionStandard = emissionStandard;
    }

    public String getEmissionStandard() {
        return  emissionStandard;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getCarClass() {
        return carClass;
    }

    @Override
    public void steering(String direction) {
        System.out.println("Car is being steered to the " + direction + ".");
    }

    @Override
    public void moving(int speed) {
        System.out.println("Car is moving at a speed of " + speed + " kmph.");
    }

    public void changeGear(int gear) {
        setGears(gear);
        System.out.println("Car is changing gears to " + gear + ".");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void decelerate() {
        System.out.println("Car is decelerating.");
    }

    @Override
    public void start() {
        System.out.println("Car is starting. Engine has successfully started.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

}
