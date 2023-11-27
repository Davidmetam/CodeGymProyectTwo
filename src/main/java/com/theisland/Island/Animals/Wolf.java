package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Horse = 10, Deer = 15, Rabbit = 60, Mouse = 80, Goat = 60, Sheep = 70, WildPig = 15, Buffalo = 10, Duck = 40)
public class Wolf extends Animal {

    public Wolf() {
        super(50, 8);
    }

    public String toString() {
        return "Wolf";
    }
}
