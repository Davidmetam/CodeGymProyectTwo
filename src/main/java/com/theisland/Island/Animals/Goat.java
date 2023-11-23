package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(grass = 100)
public class Goat extends Animal {
    public Goat() {
        super(60, 10);
    }
}
