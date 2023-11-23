package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(fox = 10, rabbit = 90, mouse = 90, duck = 80)
public class Eagle extends Animal {
    public Eagle() {
        super(6, 1);
    }
}
