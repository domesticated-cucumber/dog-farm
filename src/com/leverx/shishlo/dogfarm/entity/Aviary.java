package com.leverx.shishlo.dogfarm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aviary {

    private Dog dog;
    private boolean isClean;

    public static AviaryBuilder builder() {
        return new AviaryBuilder();
    }

    public static class AviaryBuilder {

        private Dog dog;
        private boolean isClean;

        public AviaryBuilder dog(Dog dog) {
            this.dog = dog;
            return this;
        }

        public AviaryBuilder isClean(boolean isClean) {
            this.isClean = isClean;
            return this;
        }

        public Aviary build() {
            return new Aviary(dog, isClean);
        }
    }
}
