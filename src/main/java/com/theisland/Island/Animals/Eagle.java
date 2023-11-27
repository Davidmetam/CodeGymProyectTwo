package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Fox = 10, Rabbit = 90, Mouse = 90, Duck = 80)
public class Eagle extends Animal {
    public Eagle() {
        super(6, 1);
    }

    public String toString() {
        return "Eagle";
    }
}
