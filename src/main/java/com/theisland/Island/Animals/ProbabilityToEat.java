package com.theisland.Island.Animals;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ProbabilityToEat {
    int Wolf() default 0;
    int Snake() default 0;
    int Fox() default 0;
    int Bear() default 0;
    int Eagle() default 0;
    int Horse() default 0;
    int Deer() default 0;
    int Rabbit() default 0;
    int Mouse() default 0;
    int Goat() default 0;
    int Sheep() default 0;
    int WildPig() default 0;
    int Buffalo() default 0;
    int Duck() default 0;
    int Caterpillar() default 0;
    int Grass() default 0;
}
