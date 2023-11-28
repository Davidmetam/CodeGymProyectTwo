package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Duck extends Animal {

    public Duck() {
        super(1, 0.15, new HashMap<>(){{
            put(Grass.class, 100);
            put(Caterpillar.class, 40);
        }});
    }
    public String toString() {
        return "Duck";
    }
}
