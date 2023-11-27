package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Mouse = 50, Caterpillar = 90, Grass = 100)
public class WildPig extends Animal {
    public WildPig() {
        super(400, 50);
    }

    public String toString() {
        return "WildPig";
    }
}
