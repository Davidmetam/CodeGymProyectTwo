package com.theisland.Island.Map;

import com.theisland.Island.FactoryAnimalType.Animal;
import com.theisland.Island.FactoryAnimalType.LifeCreator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Location implements Runnable {
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


    public void eatRandomAvailableAnimal(Animal hungryAnimal) {
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
        if (randomProbability <= probabilities) {
            hungryAnimal.eat(deadAnimal.get(deadAnimal.size()-1));
            deadAnimal.remove(0);
            this.animals.put(eatableAnimal, deadAnimal);
        }
    }
    public void animalsAreStarving(){
        for (Map.Entry<Class<? extends Animal>, List<Animal>> entry : animals.entrySet()) {
            List<Animal> starvingAnimals = entry.getValue();
            starvingAnimals.forEach(animal -> animal.setStarving(animal.getStarving()*.08));
        }
    }

    public void move(Animal animal) {
    }

    @Override
    public void run() {
        animalsAreStarving();
        int animalChoice = ThreadLocalRandom.current().nextInt(3);
        for (Map.Entry<Class<? extends Animal>, List<Animal>> entry : animals.entrySet()) {
            List<Animal> starvingAnimals = entry.getValue();
            for (Animal LivingAnimals : starvingAnimals) {
                switch (animalChoice) {
                    case 0:
                        eatRandomAvailableAnimal(LivingAnimals);
                        break;
                    case 2:
                        Animal babyBorn = LivingAnimals.reproduce();
                        entry.getValue().add(babyBorn);
                        break;
                    case 3:
                        move(LivingAnimals);
                }
            }
        }

    }
}
