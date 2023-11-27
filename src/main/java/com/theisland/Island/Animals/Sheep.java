package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Grass = 100)
public class Sheep extends Animal {
    public Sheep() {
        super(70, 15);
    }

    public String toString() {
        return "Sheep";
    }
}
