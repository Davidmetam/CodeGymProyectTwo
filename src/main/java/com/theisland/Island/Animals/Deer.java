package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Deer extends Animal {

    public Deer() {
        super(300, 50, new HashMap<>(){{
            put(Grass.class, 100);
        }});

    }

    public String toString() {
        return "Deer";
    }
}
