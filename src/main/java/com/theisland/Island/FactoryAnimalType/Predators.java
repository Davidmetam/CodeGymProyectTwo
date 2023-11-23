package com.theisland.Island.FactoryAnimalType;

import com.theisland.Island.Animals.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Predators implements AnimalFactory {
    private static final HashMap<Animal, Integer> maxQuantity = new HashMap<>();

    static {
        maxQuantity.put(new Wolf(), 30);
        maxQuantity.put(new Snake(), 30);
        maxQuantity.put(new Fox(), 30);
        maxQuantity.put(new Bear(), 5);
        maxQuantity.put(new Eagle(), 20);
    }


    @Override
    public List<Animal> spawn() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Animal> returnPredators = new ArrayList<>();

        for (HashMap.Entry<Animal, Integer> animal : maxQuantity.entrySet()) {
            int quantityOfAnimal = ThreadLocalRandom.current().nextInt(1, animal.getValue());

            for (int i = 0; i < quantityOfAnimal; i++) {
                Class animalClass = animal.getKey().getClass();
                try {
                    returnPredators.add((Animal) animalClass.getConstructor().newInstance());
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return returnPredators;
    }
}
