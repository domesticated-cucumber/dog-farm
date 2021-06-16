package com.leverx.shishlo.dogfarm.utils;

import com.leverx.shishlo.dogfarm.entity.Dog;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class DogUtils {

    private static final Random random = new Random();

    public static List<Dog> createDogs(List<String> names) {
        var dogs = new ArrayList<Dog>();
        for (int i = 0; i < names.size(); i++) {
            var age = random.nextInt(15);
            var isHealthy = random.nextInt(5) > 2;
            dogs.add(Dog.builder()
                    .name(names.get(i))
                    .age(age)
                    .isFed(false)
                    .isHealthy(isHealthy)
                    .isTired(false)
                    .build());
        }
        return dogs;
    }
}
