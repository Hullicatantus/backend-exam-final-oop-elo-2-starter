package com.codecool.farm.animal;

public class Cattle extends Animal {

    @Override
    public void feed() {
        size += 2;
    }

    @Override
    public String getType() {
        return "cattle";
    }
}
