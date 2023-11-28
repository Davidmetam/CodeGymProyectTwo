package com.theisland.Island.FactoryAnimalType;

import java.util.HashMap;

public abstract class Animal {
    private final double weight;
    private final double necesaryFood;
    private double starving;
    private final HashMap<Class<?>, Integer> probabilityOfEat;
    private final boolean isHungry;

    public Animal(double weight, double necesaryFood, HashMap<Class<?>, Integer> probabilityOfEat) {
        this.weight = weight;
        this.necesaryFood = necesaryFood;
        starving = necesaryFood;
        this.probabilityOfEat = probabilityOfEat;
        isHungry = true;
    }

    public boolean isHungry() {
        if (starving == necesaryFood){
            return false;
        }
        return isHungry;
    }


    public HashMap<Class<?>, Integer> getProbabilityOfEat() {
        return probabilityOfEat;
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

    public void eat(Animal eatenAnimal){
        starving += eatenAnimal.weight;
        if (starving > weight){
            starving = weight;
        }
    }
    public Animal reproduce(){
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
