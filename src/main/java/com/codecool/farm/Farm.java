package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Farm {
    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        for (int i = 0; i < animals.size(); i++) {
            if (butcher.canButcher(animals.get(i))) {
                animals.remove(i);
            }
        }
    }
    //       animals.removeIf(butcher::canButcher);

    public boolean isEmpty() {
        if (animals.isEmpty()) {
            return true;
        }
        return false;
    }

    public List<String> getStatus() {
        List<String> animalStatus = new ArrayList<>();
        for (Animal animal : animals) {
            animalStatus.addAll(Collections.singleton("There is a "
                    + animal.getSize()
                    + " sized " + (animal.getClass().getSimpleName().toLowerCase())
                    + " in the farm."));
        }
        return animalStatus;
    }


    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "" + animals.toString();
    }
}
