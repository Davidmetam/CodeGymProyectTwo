package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Grass = 100)
public class Goat extends Animal {
    public Goat() {
        super(60, 10);
    }

    public String toString() {
        return "Goat";
    }
}
