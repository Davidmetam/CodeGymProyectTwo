package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(fox = 10, rabbit = 90, mouse = 90, duck = 80)
public class Eagle extends Animal {
    public Eagle() {
        super(6, 1);
    }

    @Override
    public void eat(Animal animal) {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
