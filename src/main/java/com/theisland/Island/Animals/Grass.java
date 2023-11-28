package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Grass{
    private final int weight;

    public Grass(){
        weight = 1;
    }

    public int getWeight() {
        return weight;
    }


    public String toString() {
        return "Grass";
    }
}
