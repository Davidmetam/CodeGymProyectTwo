package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityToEat(Snake = 80, Horse = 40, Deer = 80, Rabbit = 80, Mouse = 90, Goat = 70, Sheep = 70, WildPig = 50, Buffalo = 20, Duck = 10)
public class Bear extends Animal {

    public Bear() {
        super(500, 80);
    }


    @Override
    public String toString() {
        return "Bear";
    }
}