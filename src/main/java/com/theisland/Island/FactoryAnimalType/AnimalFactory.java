package com.theisland.Island.FactoryAnimalType;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface AnimalFactory {
    public List<Animal> spawn() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
