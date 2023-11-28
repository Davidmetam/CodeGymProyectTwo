package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Buffalo extends Animal {
    public Buffalo() {
        super(700, 100, new HashMap<>(){{
            put(Grass.class, 100);
        }});
    }


    @Override
    public String toString() {
        return "Buffalo";
    }
}

