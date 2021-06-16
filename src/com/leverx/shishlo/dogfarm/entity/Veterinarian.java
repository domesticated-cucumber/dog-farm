package com.leverx.shishlo.dogfarm.entity;

public class Veterinarian extends Staff {

    public Veterinarian(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        getAviaries().stream()
                .map(Aviary::getDog)
                .forEach(dog -> {
                    if (!dog.isHealthy()) {
                        System.out.printf("Veterinarian %s starts treating the dog '%s'.%n", getName(), dog.getName());
                        dog.setHealthy(true);
                        System.out.printf("The treatment was successful, '%s' was cured.%n%n", dog.getName());
                    }
                });
    }
}
