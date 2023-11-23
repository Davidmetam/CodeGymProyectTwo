package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(rabbit = 70, mouse = 90, duck = 60, caterpillar = 40)
public class Fox extends Animal {
    public Fox() {
        super(8, 2);
    }
}
