package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Mouse extends Animal {
    public Mouse() {
        super(0.05, 0.01, new HashMap<>(){{
            put(Caterpillar.class, 90);
            put(Grass.class, 100);
        }});
    }

    public String toString() {
        return "Mouse";
    }
}
