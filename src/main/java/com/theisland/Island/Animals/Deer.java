package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.List;

@ProbabilityOfEat(Grass = 100)
public class Deer extends Animal {
    public Deer() {
        super(300, 50);
    }

    public String toString() {
        return "Deer";
    }
}
