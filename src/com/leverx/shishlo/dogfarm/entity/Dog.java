package com.leverx.shishlo.dogfarm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import static com.leverx.shishlo.dogfarm.entity.Indicator.getActivity;

@Data
@AllArgsConstructor
public class Dog implements Worker {

    private String name;
    private int age;
    private boolean isHealthy;
    private boolean isFed;
    private boolean isTired;

    @Override
    public void doWork() {
        var activity = getActivity(age);
        System.out.printf("The dog %s %s.%n",  name, activity);
        isFed = false;
        isTired = true;
    }

    public static DogBuilder builder() {
        return new DogBuilder();
    }

    public static class DogBuilder {

        private String name;
        private int age;
        private boolean isHealthy;
        private boolean isFed;
        private boolean isTired;

        public DogBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder age(int age) {
            this.age = age;
            return this;
        }

        public DogBuilder isHealthy(boolean healthy) {
            this.isHealthy = healthy;
            return this;
        }

        public DogBuilder isFed(boolean fed) {
            this.isFed = fed;
            return this;
        }

        public DogBuilder isTired(boolean trained) {
            this.isTired = trained;
            return this;
        }

        public Dog build() {
            return new Dog(name, age, isHealthy, isFed, isTired);
        }
    }
}
