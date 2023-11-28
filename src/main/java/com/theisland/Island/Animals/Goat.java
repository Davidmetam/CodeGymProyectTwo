package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityToEat(Grass = 100)
public class Goat extends Animal {
    public Goat() {
        super(60, 10);
    }

    public String toString() {
        return "Goat";
    }
}
