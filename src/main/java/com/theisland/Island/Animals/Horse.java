package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Grass = 100)
public class Horse extends Animal {
    public Horse() {
        super(400, 60);
    }

    public String toString() {
        return "Horse";
    }
}
