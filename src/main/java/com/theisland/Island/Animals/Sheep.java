package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityToEat(Grass = 100)
public class Sheep extends Animal {
    public Sheep() {
        super(70, 15);
    }

    public String toString() {
        return "Sheep";
    }
}
