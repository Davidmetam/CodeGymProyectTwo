package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Fox = 15, Rabbit = 20, Mouse = 40, Duck = 10)
public class Snake extends Animal {
    public Snake() {
        super(15, 3);
    }

    public String toString() {
        return "Snake";
    }
}
