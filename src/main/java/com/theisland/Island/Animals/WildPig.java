package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class WildPig extends Animal {
    public WildPig() {
        super(400, 50, new HashMap<>(){{
            put(Mouse.class, 50);
            put(Caterpillar.class, 90);
            put(Grass.class, 100);
        }});
    }

    public String toString() {
        return "WildPig";
    }
}
