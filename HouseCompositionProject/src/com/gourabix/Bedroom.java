package com.gourabix;

public class Bedroom {

    private String user;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Table table;
    private Lamp lamp;
    private Ceiling ceiling;
    private PersonalComputer personalComputer;

    public Bedroom(String user, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Table table, Lamp lamp, Ceiling ceiling,
                   PersonalComputer personalComputer) {
        this.user = user;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.table = table;
        this.lamp = lamp;
        this.ceiling = ceiling;
        this.personalComputer = personalComputer;
    }

    public String getUser() {
        return user;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Table getTable() {
        return table;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public PersonalComputer getPersonalComputer() {
        return personalComputer;
    }

    public void userEntrySequence() {
        getLamp().turnOnLights();
        getTable().lightUp();
        getPersonalComputer().systemPowerUp();
        getPersonalComputer().systemReady();
    }

    public void closeDoors() {
        System.out.println("Doors are now locked.");
    }

    public void playLoudMusic() {
        System.out.println("Now Playing: You can be a Hero too! from MHA.");
    }

}
