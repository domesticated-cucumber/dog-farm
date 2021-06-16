package com.leverx.shishlo.dogfarm.utils;

import com.leverx.shishlo.dogfarm.entity.Aviary;
import com.leverx.shishlo.dogfarm.entity.Dog;

import java.util.List;
import java.util.stream.Collectors;

public final class AviaryUtils {

    public static List<Aviary> createAviaries(List<Dog> dogs) {
        return dogs.stream()
                .map(dog -> Aviary.builder()
                        .isClean(true)
                        .dog(dog)
                        .build())
                .collect(Collectors.toList());
    }
}
