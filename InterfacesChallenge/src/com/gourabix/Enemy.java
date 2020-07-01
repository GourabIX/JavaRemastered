package com.gourabix;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements ISaveable {
    private String name;
    private String type;
    private int hitPoints;

    public Enemy() {
        this("default", "default");
    }

    public Enemy(String name, String type) {
        this.name = name;
        this.type = type;
        this.hitPoints = 100;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hitPoints=" + hitPoints +
                '}';
    }

    @Override
    public List<String> saveState() {
        List<String> stateValues = new ArrayList<>();
        stateValues.add(getName());
        stateValues.add(getType());
        stateValues.add(Integer.toString(getHitPoints()));
        return stateValues;
    }

    @Override
    public void readState(List<String> stateValues) {
        setName(stateValues.get(0));
        setType(stateValues.get(1));
        setHitPoints(getHitPoints());
    }
}
