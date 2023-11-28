package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityToEat(Grass = 100)
public class Horse extends Animal {
    public Horse() {
        super(400, 60);
    }

    public String toString() {
        return "Horse";
    }
}
