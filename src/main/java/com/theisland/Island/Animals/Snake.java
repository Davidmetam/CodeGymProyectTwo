package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Snake extends Animal {
    public Snake() {
        super(15, 3, new HashMap<>(){{
            put(Fox.class, 15);
            put(Rabbit.class, 20);
            put(Mouse.class, 40);
            put(Duck.class, 10);
        }});
    }

    public String toString() {
        return "Snake";
    }
}
