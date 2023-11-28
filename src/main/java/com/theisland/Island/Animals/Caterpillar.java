package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Caterpillar extends Animal {

    public Caterpillar() {
        super(0.01, 0, new HashMap<>(){{
            put(Grass.class, 100);
        }});
    }

    public String toString() {
        return "Caterpillar";
    }
}

