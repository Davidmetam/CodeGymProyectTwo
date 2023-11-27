package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(grass = 100)
public class Buffalo extends Animal {
    public Buffalo() {
        super(700, 100);
    }

    @Override
    public void eat(Animal animal) {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
