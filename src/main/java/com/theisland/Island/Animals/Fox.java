package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityToEat(Rabbit = 70, Mouse = 90, Duck = 60, Caterpillar = 40)
public class Fox extends Animal {
    public Fox() {
        super(8, 2);
    }

    public String toString() {
        return "Fox";
    }
}
