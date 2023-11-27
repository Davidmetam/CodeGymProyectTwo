package com.theisland.Island.Map;

import com.theisland.Island.FactoryAnimalType.Animal;
import com.theisland.Island.FactoryAnimalType.AnimalsCreator;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

public class Location {
    private HashMap<Animal, List<Animal>> animals;

    public Location() throws InvocationTargetException, InstantiationException, IllegalAccessException {
       animals = AnimalsCreator.spawn();
    }

    public HashMap<Animal, List<Animal>> getAnimals() {
        return animals;
    }

    public void setAnimals(HashMap<Animal, List<Animal>> animals) {
        this.animals = animals;
    }



}
