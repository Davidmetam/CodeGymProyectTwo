package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(mouse = 50, caterpillar = 90, grass = 100)
public class WildPig extends Animal {
    public WildPig() {
        super(400, 50);
    }
}
