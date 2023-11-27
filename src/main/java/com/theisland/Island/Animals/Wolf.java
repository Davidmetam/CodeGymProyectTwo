package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(horse = 10, deer = 15, rabbit = 60, mouse = 80, goat = 60, sheep = 70, wildPig = 15, buffalo = 10, duck = 40)
public class Wolf extends Animal {

    public Wolf() {
        super(50, 8);
    }

    @Override
    public void eat(Animal animal) {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
