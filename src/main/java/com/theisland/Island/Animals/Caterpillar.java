package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Grass = 100)
public class Caterpillar extends Animal {
    public Caterpillar() {
        super(0.01, 0);
    }

    public String toString() {
        return "Caterpillar";
    }
}

