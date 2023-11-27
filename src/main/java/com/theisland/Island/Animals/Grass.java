package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Grass extends Animal {
    public Grass() {
        super(1, 0);
    }

    public String toString() {
        return "Grass";
    }
}
