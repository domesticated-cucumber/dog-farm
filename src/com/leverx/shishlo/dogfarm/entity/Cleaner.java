package com.leverx.shishlo.dogfarm.entity;

import static com.leverx.shishlo.dogfarm.entity.Indicator.getFood;

public class Cleaner extends Staff {

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        var aviaries = getAviaries();
        for (var aviary : aviaries) {
            if (!aviary.isClean()) {
                System.out.printf("Cleaner %s starts cleaning '%s's' aviary.%n", getName(), aviary.getDog().getName());
                aviary.setClean(true);
                System.out.printf("%s successfully cleaned '%s's' aviary.%n%n", getName(), aviary.getDog().getName());
                continue;
            }
            if (aviary.getDog() != null && !aviary.getDog().isFed()) {
                System.out.printf("Cleaner %s begins feeding the dog '%s'.%n", getName(), aviary.getDog().getName());
                var food = getFood(aviary.getDog().getAge());
                aviary.getDog().setFed(true);
                aviary.setClean(false);
                System.out.printf("%s fed dog '%s' with %s .%n%n", getName(), aviary.getDog().getName(), food);
            }
        }
    }
}
