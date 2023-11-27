package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Caterpillar = 90, Grass = 100)
public class Duck extends Animal {
    public Duck() {
        super(1, 0.15);
    }
    public String toString() {
        return "Duck";
    }
}
