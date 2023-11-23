package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(snake = 80, horse = 40, deer = 80, rabbit = 80, mouse = 90, goat = 70, sheep = 70, wildPig = 50, buffalo = 20, duck = 10)
public class Bear extends Animal {

    public Bear() {
        super(500, 80);
    }
}
