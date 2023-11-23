package com.theisland.Island.Animals;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ProbabilityOfEat {
    int wolf() default 0;
    int snake() default 0;
    int fox() default 0;
    int bear() default 0;
    int eagle() default 0;
    int horse() default 0;
    int deer() default 0;
    int rabbit() default 0;
    int mouse() default 0;
    int goat() default 0;
    int sheep() default 0;
    int wildPig() default 0;
    int buffalo() default 0;
    int duck() default 0;
    int caterpillar() default 0;
    int grass() default 0;
}
