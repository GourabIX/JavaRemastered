package com.gourabix;

import java.util.ArrayList;
import java.util.List;

public class Character implements ISaveable {
    private String name;
    private String type;

    public Character() {
        this("default", "default");
    }

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public List<String> saveState() {
        List<String> stateValues = new ArrayList<>();
        stateValues.add(getName());
        stateValues.add(getType());
        return stateValues;
    }

    @Override
    public void readState(List<String> stateValues) {
        setName(stateValues.get(0));
        setType(stateValues.get(1));
    }
}
