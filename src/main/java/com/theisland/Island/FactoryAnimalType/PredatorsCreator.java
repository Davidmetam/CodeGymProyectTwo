package com.theisland.Island.FactoryAnimalType;

import com.theisland.Island.Animals.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class PredatorsCreator{
    private static final HashMap<Animal, Integer> maxQuantity = new HashMap<>();

    static {
        maxQuantity.put(new Wolf(), 30);
        maxQuantity.put(new Snake(), 30);
        maxQuantity.put(new Fox(), 30);
        maxQuantity.put(new Bear(), 5);
        maxQuantity.put(new Eagle(), 20);
    }


    public static HashMap<Animal, List<Animal>> spawn() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        HashMap<Animal, List<Animal>> predators = new HashMap<>();

        for (HashMap.Entry<Animal, Integer> animal : maxQuantity.entrySet()) {
            int quantityOfAnimal = ThreadLocalRandom.current().nextInt(1, animal.getValue());
            List<Animal> listOfCurrentAnimal = new ArrayList<>();

            for (int i = 0; i < quantityOfAnimal; i++) {
                Class animalClass = animal.getKey().getClass();
                try {
                    listOfCurrentAnimal.add((Animal) animalClass.getConstructor().newInstance());
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
            predators.put(animal.getKey(), listOfCurrentAnimal);
        }
        return predators;
    }

}
