package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(fox = 15, rabbit = 20, mouse = 40, duck = 10)
public class Snake extends Animal {
    public Snake() {
        super(15, 3);
    }
}
