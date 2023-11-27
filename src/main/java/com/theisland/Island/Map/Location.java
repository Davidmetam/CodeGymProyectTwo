package com.theisland.Island.Map;

import com.theisland.Island.FactoryAnimalType.Animal;
import com.theisland.Island.FactoryAnimalType.HerbivorousCreator;
import com.theisland.Island.FactoryAnimalType.PredatorsCreator;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

public class Location {
    HashMap<Animal, List<Animal>> herbivorous;
    HashMap<Animal, List<Animal>> predators;

    public Location() throws InvocationTargetException, InstantiationException, IllegalAccessException {
       HashMap<Animal, List<Animal>> predators = PredatorsCreator.spawn();
       HashMap<Animal, List<Animal>> herbivorous = PredatorsCreator.spawn();
    }

}
