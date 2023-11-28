package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Rabbit extends Animal {
    public Rabbit() {
        super(2, 0.45, new HashMap<>(){{
            put(Grass.class, 100);
        }});
    }

    public String toString() {
        return "Rabbit";
    }
}
