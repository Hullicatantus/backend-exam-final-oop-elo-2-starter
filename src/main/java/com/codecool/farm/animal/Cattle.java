package com.codecool.farm.animal;

public class Cattle extends Animal {
    int size = 0;

    public Cattle() {
        this.size = super.getSize();
    }

    @Override
    public void feed() {
        this.size += 2;
    }

    @Override
    public int getSize() {
        return size;
    }
}
