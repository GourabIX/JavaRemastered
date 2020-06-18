package com.gourabix;

public class HighOctaneRacingCar extends Car {

    private boolean hasNitrous;
    private boolean hasTurbo;
    private double zeroToSixty;
    private int topSpeed;
    private int acceleration;
    private boolean hasABS;
    private String driveType;

    public HighOctaneRacingCar(int light, int tyre, String engine, int brake, boolean windShield, String emissionStandard, int gears, String carClass, boolean hasNitrous, boolean hasTurbo, double zeroToSixty, int topSpeed, int acceleration, boolean hasABS, String driveType) {
        super(light, tyre, engine, brake, windShield, emissionStandard, gears, carClass);
        this.hasNitrous = hasNitrous;
        this.hasTurbo = hasTurbo;
        this.zeroToSixty = zeroToSixty;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.hasABS = hasABS;
        this.driveType = driveType;
    }

    public HighOctaneRacingCar(int light, int tyre, String engine, int brake, boolean hasNitrous, boolean hasTurbo, double zeroToSixty, int topSpeed, int acceleration, boolean hasABS, String driveType) {
        this(light, tyre, engine, brake, false, UNKNOWN_VALUE, 0, UNKNOWN_VALUE, hasNitrous, hasTurbo, zeroToSixty, topSpeed, acceleration, hasABS, driveType);
    }

    public HighOctaneRacingCar(boolean windShield, String emissionStandard, int gears, String carClass, boolean hasNitrous, boolean hasTurbo, double zeroToSixty, int topSpeed, int acceleration, boolean hasABS, String driveType) {
        this(0, 0, UNKNOWN_VALUE, 0, windShield, emissionStandard, gears, carClass, hasNitrous, hasTurbo, zeroToSixty, topSpeed, acceleration, hasABS, driveType);
    }

    public HighOctaneRacingCar(boolean hasNitrous, boolean hasTurbo, double zeroToSixty, int topSpeed, int acceleration, boolean hasABS, String driveType) {
        this(0, 0, UNKNOWN_VALUE, 0, false, UNKNOWN_VALUE, 0, UNKNOWN_VALUE, hasNitrous, hasTurbo, zeroToSixty, topSpeed, acceleration, hasABS, driveType);
    }

    public HighOctaneRacingCar() {
        this(0, 0, UNKNOWN_VALUE, 0, false, UNKNOWN_VALUE, 0, UNKNOWN_VALUE, false, false, 0, 0, 0, false, UNKNOWN_VALUE);
    }

    public boolean isHasNitrous() {
        return hasNitrous;
    }

    public void setHasNitrous(boolean hasNitrous) {
        this.hasNitrous = hasNitrous;
    }

    public boolean isHasTurbo() {
        return hasTurbo;
    }

    public void setHasTurbo(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }

    public double getZeroToSixty() {
        return zeroToSixty;
    }

    public void setZeroToSixty(double zeroToSixty) {
        this.zeroToSixty = zeroToSixty;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    @Override
    public void steering(String direction) {
        System.out.println("High Octane Racing Car is steering towards " + direction);
    }

    @Override
    public void moving(int speed) {
        System.out.println("High Octance Racing Car is moving at a speed of " + speed);
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("High Octane Racing gar is changing gears to " + gear);
        System.out.println("Auto Suspension engaged!");
    }

    @Override
    public void accelerate() {
        System.out.println("High Octane Racing Car is accelerating.");
        changeGear(4);
    }

    @Override
    public void decelerate() {
        System.out.println("High Octane Racing Car is decelerating.");
        changeGear(2);
    }

    public void engageNitrous() {
        System.out.println("Hang on! Nitrous engaged.");
    }

    public void engageTurbo() {
        System.out.println("Turbo system activated. All thrusters firing.");
    }

    public void maximumSpeed() {
        accelerate();
        engageNitrous();
        engageTurbo();
        System.out.println("High Octane Racing Car has reached top speed.");
    }

    @Override
    public void start() {
        System.out.println("SLS-AMG Black by Mercedes Benz is powering up... Engine and features are online.");
        super.start();
    }

    @Override
    public void stop() {
        System.out.println("SLS-AMG Black by Mercedes Benz is powering down...");
        super.stop();
    }
}
