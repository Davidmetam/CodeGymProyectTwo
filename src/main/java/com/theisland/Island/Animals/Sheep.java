package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Sheep extends Animal {
    public Sheep() {
        super(70, 15, new HashMap<>(){{
            put(Grass.class, 100);
        }});
    }

    public String toString() {
        return "Sheep";
    }
}
