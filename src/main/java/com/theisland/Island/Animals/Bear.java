package com.theisland.Island.Animals;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.util.HashMap;

public class Bear extends Animal {

    public Bear() {
        super(500, 80, new HashMap<>(){{
            put(Snake.class, 80);
            put(Horse .class,40);
            put(Deer .class,80);
            put(Rabbit .class,80);
            put(Mouse .class,90);
            put(Goat .class,70);
            put(Sheep .class,70);
            put(WildPig .class,50);
            put(Buffalo .class,20);
            put(Duck .class,10);
        }});
    }


    @Override
    public String toString() {
        return "Bear";
    }
}