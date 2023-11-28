package com.theisland.Island.FactoryAnimalType;

import com.theisland.Island.Animals.ProbabilityToEat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import com.theisland.Island.Animals.*;

public abstract class Animal {
    private final double weight;
    private final double necesaryFood;
    private double starving;

    public Animal(double weight, double necesaryFood) {
        this.weight = weight;
        this.necesaryFood = necesaryFood;
        starving = necesaryFood;
    }

    public double getWeight() {
        return weight;
    }

    public double getNecesaryFood() {
        return necesaryFood;
    }

    public double getStarving() {
        return starving;
    }

    public void setStarving(double starving) {
        this.starving = starving;
    }

    public Class<? extends Animal> eat(HashMap<Class<? extends Animal>, List<Animal>> animals) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException{
        List<String> eatableAnimals = getEatableAnimals();
        if (getStarving() < getNecesaryFood()) {
            ThreadLocalRandom pickRandomAnimal = ThreadLocalRandom.current();
            int randomAnimal = pickRandomAnimal.nextInt(eatableAnimals.size());
            String animalToBeEaten = "com.theisland.Island.Animals."+eatableAnimals.get(randomAnimal);
            if();
        }

        return null;
    }
    public Animal reproduce(){
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    public void move(){}
    public List<String> getEatableAnimals() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        ProbabilityToEat annotation = this.getClass().getAnnotation(ProbabilityToEat.class);

        List<String> eatableAnimals = new ArrayList<>();
        Method[] animalsAnnotated = ProbabilityToEat.class.getDeclaredMethods();

        for (Method method : animalsAnnotated) {
            String animalName = method.getName();
            int probability = (int) method.invoke(annotation);
            if(probability == 0){
                continue;
            }

            eatableAnimals.add(animalName);
        }
        return eatableAnimals;
    }


}
