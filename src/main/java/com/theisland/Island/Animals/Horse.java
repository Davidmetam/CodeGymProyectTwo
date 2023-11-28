package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Horse extends Animal {
    public Horse() {
        super(400, 60, new HashMap<>(){{
            put(Grass.class, 100);
        }});
    }

    public String toString() {
        return "Horse";
    }
}
