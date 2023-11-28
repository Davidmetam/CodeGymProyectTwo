package com.theisland.Island.FactoryAnimalType;

import com.theisland.Island.Animals.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LifeCreator {
    private static final HashMap<Class<?>, Integer> maxQuantity = new HashMap<>();

    static {
        maxQuantity.put(Wolf.class, 30);
        maxQuantity.put(Snake.class, 30);
        maxQuantity.put(Fox.class, 30);
        maxQuantity.put(Bear.class, 5);
        maxQuantity.put(Eagle.class, 20);
        maxQuantity.put(Horse.class, 20);
        maxQuantity.put(Deer.class, 20);
        maxQuantity.put(Rabbit.class, 150);
        maxQuantity.put(Mouse.class, 500);
        maxQuantity.put(Goat.class, 140);
        maxQuantity.put(Sheep.class, 140);
        maxQuantity.put(WildPig.class, 50);
        maxQuantity.put(Buffalo.class, 10);
        maxQuantity.put(Duck.class, 200);
        maxQuantity.put(Caterpillar.class, 1000);
        maxQuantity.put(Grass.class, 200);
    }

    public static HashMap<Class<?>, List<Animal>> spawn() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        HashMap<Class<?>, List<Animal>> animals = new HashMap<>();

        for (HashMap.Entry<Class<?>, Integer> animal : maxQuantity.entrySet()) {
            int quantityOfAnimal = ThreadLocalRandom.current().nextInt(1, animal.getValue());
            List<Animal> listOfCurrentAnimal = new ArrayList<>();

            for (int i = 0; i < quantityOfAnimal; i++) {
                Class animalClass = animal.getKey();
                try {
                    listOfCurrentAnimal.add((Animal) animalClass.getConstructor().newInstance());
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
            animals.put(animal.getKey(), listOfCurrentAnimal);
        }
        return animals;
    }
}
