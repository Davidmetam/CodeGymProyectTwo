package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(caterpillar = 90, grass = 100)
public class Mouse extends Animal {
    public Mouse() {
        super(0.05, 0.01);
    }
}
