package com.codecool.farm.animal;

public class Pig extends Animal {

    @Override
    public void feed() {
        size += 1;
    }

    @Override
    public String getType() {
        return "pig";
    }
}
