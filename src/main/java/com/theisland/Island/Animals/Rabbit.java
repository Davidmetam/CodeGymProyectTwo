package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(grass = 100)
public class Rabbit extends Animal {
    public Rabbit() {
        super(2, 0.45);
    }
}
