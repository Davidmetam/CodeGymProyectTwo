package com.theisland.Island.Map;

import com.theisland.Island.FactoryAnimalType.Animal;
import com.theisland.Island.FactoryAnimalType.LifeCreator;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Location {
    private HashMap<Class<? extends Animal>, List<Animal>> animals;
    private int grassQuantity;

    public Location() throws InvocationTargetException, InstantiationException, IllegalAccessException {
       animals = LifeCreator.spawn();
        grassQuantity = getGrass();
    }

    private int getGrass() {
        return ThreadLocalRandom.current().nextInt(200);
    }

    public HashMap<Class<? extends Animal>, List<Animal>> getAnimals() {
        return animals;
    }

    public void setAnimals(HashMap<Class<? extends Animal>, List<Animal>> animals) {
        this.animals = animals;
    }



}
