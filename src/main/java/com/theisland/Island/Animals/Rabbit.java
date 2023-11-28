package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityToEat(Grass = 100)
public class Rabbit extends Animal {
    public Rabbit() {
        super(2, 0.45);
    }

    public String toString() {
        return "Rabbit";
    }
}
