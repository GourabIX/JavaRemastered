package com.gourabix;

public class PC {

    private Motherboard motherboard;            // Example of composition. PC HAS-A motherboard.
    private Case theCase;                       // PC HAS-A case
    private Monitor monitor;                    // PC HAS-A monitor

    // Note that here neither of Motherboard, Case or Monitor is a PC. But they are components of a PC. In other
    // words, a PC's composition includes a Motherboard, Case and a Monitor. So a PC HAS-A motherboard, case and
    // monitor.

    public PC(Motherboard motherboard, Case theCase, Monitor monitor) {
        this.motherboard = motherboard;
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void powerUp() {
        getTheCase().pressPowerButton();
        getMotherboard().bootUp();
        getMonitor().drawPixelAt(1024, 700, "White");
    }

}
