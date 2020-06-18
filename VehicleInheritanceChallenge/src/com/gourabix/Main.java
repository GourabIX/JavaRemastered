package com.gourabix;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(2, 4, "BS-VI", 4);
        vehicle.start();
        vehicle.moving(40);
        vehicle.steering("north-east");
        vehicle.stop();

        Car car = new Car(2, 4, "BS-VI", 4, true, "eco-green", 5, "Sedan");
        car.start();
        car.moving(50);
        car.steering("North");
        car.moving(65);
        car.accelerate();
        car.changeGear(4);
        car.decelerate();
        car.changeGear(2);
        car.stop();

        HighOctaneRacingCar slsAmg = new HighOctaneRacingCar(4, 4, "BS-VI", 6, true,
                "performance", 7, "Sports & Racing", true, true,
                3.14, 347, 82, true, "AWD");
        slsAmg.start();
        slsAmg.moving(10);
        slsAmg.accelerate();
        slsAmg.engageNitrous();
        slsAmg.changeGear(5);
        slsAmg.changeGear(6);
        slsAmg.maximumSpeed();
        slsAmg.decelerate();
        slsAmg.changeGear(5);
        slsAmg.changeGear(4);
        slsAmg.steering("West");
        slsAmg.accelerate();
        slsAmg.engageNitrous();
        slsAmg.maximumSpeed();
        slsAmg.stop();

    }
}
