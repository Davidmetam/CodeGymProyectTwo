package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityToEat(Grass = 100)
public class Buffalo extends Animal {
    public Buffalo() {
        super(700, 100);
    }


    @Override
    public String toString() {
        return "Buffalo";
    }
}

