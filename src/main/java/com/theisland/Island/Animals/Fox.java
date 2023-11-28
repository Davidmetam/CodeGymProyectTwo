package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Fox extends Animal {
    public Fox() {
        super(8, 2, new HashMap<>(){{
            put(Rabbit.class, 70);
            put(Mouse.class, 90);
            put(Caterpillar.class, 40);
            put(Duck.class, 60);
        }});
    }

    public String toString() {
        return "Fox";
    }
}
