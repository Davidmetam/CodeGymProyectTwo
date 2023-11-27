package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

@ProbabilityOfEat(mouse = 50, caterpillar = 90, grass = 100)
public class WildPig extends Animal {
    public WildPig() {
        super(400, 50);
    }

    @Override
    public void eat(Animal animal) {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
