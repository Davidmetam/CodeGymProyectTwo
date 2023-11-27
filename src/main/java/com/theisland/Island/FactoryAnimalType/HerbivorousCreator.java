package com.theisland.Island.FactoryAnimalType;

import com.theisland.Island.Animals.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class HerbivorousCreator {
    private static final HashMap<Animal, Integer> maxQuantity = new HashMap<>();

    static {
        maxQuantity.put(new Horse(), 20);
        maxQuantity.put(new Deer(), 20);
        maxQuantity.put(new Rabbit(), 150);
        maxQuantity.put(new Mouse(), 500);
        maxQuantity.put(new Goat(), 140);
        maxQuantity.put(new Sheep(), 140);
        maxQuantity.put(new WildPig(), 50);
        maxQuantity.put(new Buffalo(), 10);
        maxQuantity.put(new Duck(), 200);
        maxQuantity.put(new Caterpillar(), 1000);
    }

    public static HashMap<Animal, List<Animal>> spawn() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        HashMap<Animal, List<Animal>> herbivorous = new HashMap<>();

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
            herbivorous.put(animal.getKey(), listOfCurrentAnimal);
        }
        return herbivorous;
    }
}
