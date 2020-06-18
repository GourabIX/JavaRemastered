package com.gourabix;

public class PersonalComputer {

    private Monitor smMonitor;
    private Case cmCase;
    private Motherboard gaMotherboard;

    public PersonalComputer(Monitor smMonitor, Case cmCase, Motherboard gaMotherboard) {
        this.smMonitor = smMonitor;
        this.cmCase = cmCase;
        this.gaMotherboard = gaMotherboard;
    }

    public Monitor getSmMonitor() {
        return smMonitor;
    }

    public Case getCmCase() {
        return cmCase;
    }

    public Motherboard getGaMotherboard() {
        return gaMotherboard;
    }

    public void systemPowerUp() {
        getCmCase().powerButtonPressed();
        getGaMotherboard().bootUp();
        getSmMonitor().drawPixel(1254, 980, "green");
    }

    public void systemReady() {
        System.out.println("System is now ready and available for instructions!");
    }

}
