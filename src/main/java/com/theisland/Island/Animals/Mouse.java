package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Caterpillar = 90, Grass = 100)
public class Mouse extends Animal {
    public Mouse() {
        super(0.05, 0.01);
    }

    public String toString() {
        return "Mouse";
    }
}
