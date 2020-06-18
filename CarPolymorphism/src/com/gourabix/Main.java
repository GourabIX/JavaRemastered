package com.gourabix;

class Car {
    boolean engine;
    int cylinders;
    int wheels;
    int windows;
    String name;
    int initialSpeed;

    public Car(int cylinders, int windows, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.windows = windows;
        this.name = name;
        this.initialSpeed = 0;
    }

    public void measureAcceleration() {
        System.out.println("No acceleration data for generic car!");
    }

    public void startEngine() {
        System.out.println("Can't start engine :: Generic Base Class.");
    }

    public void accelerate(int rate) {
        System.out.println("Can't accelerate :: Generic Base Class.");
    }

    public void brake(int slowdownRate) {
        System.out.println("Can't brake :: Generic Base Class.");
    }

    public String getName() {
        return name;
    }

    public int getInitialSpeed() {
        return initialSpeed;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Porsche extends Car {

    public Porsche(int cylinders, int windows, String name) {
        super(cylinders, windows, name);
    }

    @Override
    public void measureAcceleration() {
        System.out.println("0 - 100 km/h = 3.9s");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine for " + getName() + "...");
    }

    @Override
    public void accelerate(int rate) {
        initialSpeed += rate;
        System.out.println("Speed after accelerating with a rate of " + rate + ": " + initialSpeed);
    }

    @Override
    public void brake(int slowdownRate) {
        initialSpeed -= slowdownRate;
        System.out.println("Speed after decelerating with a rate of " + slowdownRate + ": " + initialSpeed);
    }
}

class Tesla extends Car {

    public Tesla(int cylinders, int windows, String name) {
        super(cylinders, windows, name);
    }

    @Override
    public void measureAcceleration() {
        System.out.println("0 - 60 km/h = 1.9s");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine for " + getName() + "...");
    }

    @Override
    public void accelerate(int rate) {
        initialSpeed += rate;
        System.out.println("Speed after accelerating at a rate of " + rate + ": " + initialSpeed);
    }

    @Override
    public void brake(int slowdownRate) {
        initialSpeed -= slowdownRate;
        System.out.println("Speed after decelerating at a rate of " + slowdownRate + ": " + initialSpeed);
    }
}

class Bmw extends Car {

    public Bmw(int cylinders, int windows, String name) {
        super(cylinders, windows, name);
    }

//    @Override
//    public void measureAcceleration() {
//        System.out.println("0 - 60 km/h = 4.2s");
//    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine for " + getName() + "...");
    }

    @Override
    public void accelerate(int rate) {
        initialSpeed += rate;
        System.out.println("Speed after accelerating at a rate of " + rate + ": " + initialSpeed);
    }

    @Override
    public void brake(int slowdownRate) {
        initialSpeed -= slowdownRate;
        System.out.println("Speed after decelerating at a rate of " + slowdownRate + ": " + initialSpeed);
    }
}

class Ford extends Car {

    public Ford(int cylinders, int windows, String name) {
        super(cylinders, windows, name);
    }

    @Override
    public void measureAcceleration() {
        System.out.println("0 - 60 km/h = 3.3s");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine for " + getName() + " is powering up...");
    }

    @Override
    public void accelerate(int rate) {
        initialSpeed += rate;
        System.out.println("Speed after accelerating at a rate of " + rate + ": " + initialSpeed);
    }

    @Override
    public void brake(int slowdownRate) {
        initialSpeed -= slowdownRate;
        System.out.println("Speed after decelerating at a rate of " + slowdownRate + ": " + initialSpeed);
    }
}

public class Main {

    public static void main(String[] args) {

        Porsche gt3911 = new Porsche(8, 4, "Porsche 911 GT3");
        System.out.println(gt3911.getName());
        System.out.println("No. of cylinders: " + gt3911.getCylinders());
        gt3911.startEngine();
        gt3911.measureAcceleration();
        gt3911.accelerate(67);
        gt3911.brake(52);

        System.out.println();

        Tesla roadster = new Tesla(4, 4, "Tesla Roadster");
        System.out.println(roadster.getName());
        System.out.println("No. of cylinders: " + roadster.getCylinders());
        roadster.startEngine();
        roadster.measureAcceleration();
        roadster.accelerate(105);
        roadster.brake(20);
        System.out.println("Current speed: " + roadster.getInitialSpeed());

        System.out.println();

        Ford mustangGt500 =  new Ford(8, 4, "Ford Shelby Mustang GT500");
        System.out.println(mustangGt500.getName());
        System.out.println("No. of cylinders: " + mustangGt500.getCylinders());
        mustangGt500.startEngine();
        mustangGt500.measureAcceleration();
        mustangGt500.accelerate(92);
        mustangGt500.brake(54);
        System.out.println("Current speed: " + mustangGt500.getInitialSpeed());

        System.out.println();

        Bmw z4 = new Bmw(4, 4, "BMW Z4 Convertible");
        System.out.println(z4.getName());
        System.out.println("No. of cylinders: " + z4.getCylinders());
        z4.startEngine();
        z4.accelerate(55);
        z4.brake(20);
        z4.measureAcceleration();
        System.out.println("Current speed: " + z4.getInitialSpeed());

    }
}
