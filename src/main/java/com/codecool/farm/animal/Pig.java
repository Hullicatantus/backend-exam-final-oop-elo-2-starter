package com.codecool.farm.animal;

public class Pig extends Animal {
    int size = 0;

    public Pig() {
        this.size = super.getSize();
    }

    @Override
    public void feed() {
        this.size += 1;
    }

    @Override
    public int getSize() {
        return size;
    }
}
