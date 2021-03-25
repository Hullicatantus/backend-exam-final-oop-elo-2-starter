package com.codecool.farm.animal;

public abstract class Animal {
    protected int size = 0;

    public Animal() {
        this.size = 0;
    }

    public abstract void feed();

    public int getSize() {
        return size;
    }

    public abstract String getType();
}
