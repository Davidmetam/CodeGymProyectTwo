package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(grass = 100)
public class Horse extends Animal {
    public Horse() {
        super(400, 60);
    }
}
