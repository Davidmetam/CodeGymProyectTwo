package com.theisland.Island.FactoryAnimalType;

import com.theisland.Island.Animals.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Herbivorous implements AnimalFactory{
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
    @Override
    public List<Animal> spawn() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Animal> returnHerbivorous = new ArrayList<>();

        for (HashMap.Entry<Animal, Integer> animal : maxQuantity.entrySet()) {
            int quantityOfAnimal = ThreadLocalRandom.current().nextInt(1, animal.getValue());

            for (int i = 0; i < quantityOfAnimal; i++) {
                Class animalClass = animal.getKey().getClass();
                try {
                    returnHerbivorous.add((Animal) animalClass.getConstructor().newInstance());
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return returnHerbivorous;
    }
}
