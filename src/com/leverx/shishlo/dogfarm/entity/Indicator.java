package com.leverx.shishlo.dogfarm.entity;

import com.leverx.shishlo.dogfarm.exception.DogFarmException;
import java.util.stream.Stream;

public enum Indicator {

    PUPPY(0, 1, "Royal Canin Puppy Active", "training"),
    ADULT(2, 8, "Royal Canin Club PRO CC", "works for the police"),
    OLD(9, 25, "Royal Canin Adult 8+", "relaxing");

    private final int minAge;
    private final int maxAge;
    private final String food;
    private final String activity;

    Indicator(int minAge, int maxAge, String food, String activity) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.food = food;
        this.activity = activity;
    }

    public static String getFood(int age) {
        return Stream.of(values())
                .filter(value -> value.minAge <= age && value.maxAge >= age)
                .map(value -> value.food)
                .findFirst()
                .orElseThrow(() -> new DogFarmException("The age was entered incorrectly."));
    }

    public static String getActivity(int age) {
        return Stream.of(values())
                .filter(value -> value.minAge <= age && value.maxAge >= age)
                .map(value -> value.activity)
                .findFirst()
                .orElseThrow(() -> new DogFarmException("The age was entered incorrectly."));
    }
}
