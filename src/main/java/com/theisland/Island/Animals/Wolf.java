package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Wolf extends Animal {
    public Wolf() {
        super(50, 8, new HashMap<>(){{
            put(Horse.class, 10);
            put(Deer.class, 15);
            put(Rabbit.class, 60);
            put(Mouse.class, 80);
            put(Goat.class, 60);
            put(Sheep.class, 70);
            put(WildPig.class, 15);
            put(Buffalo.class, 10);
            put(Duck.class, 40);
        }});
    }

    public String toString() {
        return "Wolf";
    }
}
