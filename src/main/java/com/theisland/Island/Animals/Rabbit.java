package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Grass = 100)
public class Rabbit extends Animal {
    public Rabbit() {
        super(2, 0.45);
    }

    public String toString() {
        return "Rabbit";
    }
}
