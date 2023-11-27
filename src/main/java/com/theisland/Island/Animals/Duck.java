package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(caterpillar = 90, grass = 100)
public class Duck extends Animal {
    public Duck() {
        super(1, 0.15);
    }

    @Override
    public void eat(Animal animal) {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
