package com.theisland.Island.Map;

import com.theisland.Island.FactoryAnimalType.Animal;
import com.theisland.Island.FactoryAnimalType.LifeCreator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Location {
    private HashMap<Class<?>, List<Animal>> animals;
    private int grassQuantity;

    public Location() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        animals = LifeCreator.spawn();
        grassQuantity = getGrass();
    }

    private int getGrass() {
        return ThreadLocalRandom.current().nextInt(200);
    }

    public HashMap<Class<?>, List<Animal>> getAnimals() {
        return animals;
    }

    public void setAnimals(HashMap<Class<?>, List<Animal>> animals) {
        this.animals = animals;
    }

    //para comer primero se obtendra la lista de animales que se puede comer el animal hambriento (proceso de observacion del animal)
    public void eatRandomExistentAnimal(Animal hungryAnimal) {
        if (!hungryAnimal.isHungry()) {
            return;
        }
        HashMap<Class<?>, Integer> animals = hungryAnimal.getProbabilityOfEat();
        List<Class<?>> eatableAnimals = new ArrayList<>();
        for (Map.Entry<Class<?>, Integer> entry : animals.entrySet()) {
            eatableAnimals.add(entry.getKey());
        }
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int randomAnimal = random.nextInt(eatableAnimals.size());
        if (this.animals.get(eatableAnimals.get(randomAnimal)) == null) {
            return;
        }
        Class<? extends Animal> eatableAnimal = (Class<? extends Animal>) eatableAnimals.get(randomAnimal);
        List<Animal> deadAnimal = this.animals.get(eatableAnimal);
        int probabilities = hungryAnimal.getProbabilityOfEat().get(eatableAnimal);
        int randomProbability = random.nextInt(100);
        if (randomProbability > probabilities) {
            return;
        } else {
            hungryAnimal.eat(deadAnimal.get(0));
            deadAnimal.remove(0);
            this.animals.put(eatableAnimal, deadAnimal);
        }
    }

    public void move() {
    }
}
