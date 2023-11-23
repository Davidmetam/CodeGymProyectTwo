package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(grass = 100)
public class Caterpillar extends Animal {
    public Caterpillar() {
        super(0.01, 0);
    }
}
