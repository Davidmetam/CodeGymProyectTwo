package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Eagle extends Animal {

    public Eagle() {
        super(6, 1, new HashMap<>(){{
            put(Fox.class, 10);
            put(Rabbit.class, 90);
            put(Mouse.class, 90);
            put(Duck.class, 80);
        }});
    }

    public String toString() {
        return "Eagle";
    }
}
