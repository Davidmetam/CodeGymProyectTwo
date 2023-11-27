package com.theisland.Island.FactoryAnimalType;

public abstract class Animal {
    final double weight;
    final double necesaryFood;

    public Animal(double weight, double necesaryFood) {
        this.weight = weight;
        this.necesaryFood = necesaryFood;
    }

    public abstract void eat(Animal animal);
    public abstract Animal reproduce();
    public void move(){}
}
