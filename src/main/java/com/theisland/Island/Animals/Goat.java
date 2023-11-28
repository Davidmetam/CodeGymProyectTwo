package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Goat extends Animal {
    public Goat() {
        super(60, 10, new HashMap<>(){{
            put(Grass.class, 100);
        }});
    }

    public String toString() {
        return "Goat";
    }
}
