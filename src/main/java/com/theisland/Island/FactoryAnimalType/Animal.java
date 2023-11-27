package com.theisland.Island.FactoryAnimalType;

import com.theisland.Island.Animals.ProbabilityOfEat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

public abstract class Animal {
    private final double weight;
    private final double necesaryFood;
    private double starving;

    public Animal(double weight, double necesaryFood) {
        this.weight = weight;
        this.necesaryFood = necesaryFood;
        starving = necesaryFood;
    }

    public double getWeight() {
        return weight;
    }

    public double getNecesaryFood() {
        return necesaryFood;
    }

    public double getStarving() {
        return starving;
    }

    public void setStarving(double starving) {
        this.starving = starving;
    }

    public boolean eat(List<Animal> eatable) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException{
        HashMap<Class<?>, Integer> eatableAnimals = getEatableAnimals();
        if (getStarving() != getNecesaryFood()) {

        }

        return true;
    }
    public Animal reproduce(){
        return null;
    }
    public void move(){}
    public HashMap<Class<?>, Integer> getEatableAnimals() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        ProbabilityOfEat annotation = this.getClass().getAnnotation(ProbabilityOfEat.class);

        HashMap<Class<?>, Integer> eatableAnimals = new HashMap<>();
        Method[] animalsAnnotated = ProbabilityOfEat.class.getDeclaredMethods();

        for (Method method : animalsAnnotated) {
            String animalName = method.getName();
            int probability = (int) method.invoke(annotation);
            if(probability == 0){
                continue;
            }

            eatableAnimals.put(Class.forName("com.theisland.Island.Animals"+animalName), probability);
        }
        return eatableAnimals;
    }


}
