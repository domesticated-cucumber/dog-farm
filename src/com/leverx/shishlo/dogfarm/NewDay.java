package com.leverx.shishlo.dogfarm;

import com.leverx.shishlo.dogfarm.entity.Cleaner;
import com.leverx.shishlo.dogfarm.entity.Veterinarian;
import java.util.List;
import static com.leverx.shishlo.dogfarm.utils.AviaryUtils.createAviaries;
import static com.leverx.shishlo.dogfarm.utils.DogUtils.createDogs;

public class NewDay {

    public static void main(String[] args) {

        var dogs = createDogs(List.of("Tuzik", "Sharik", "Reks", "Polkan"));
        var aviaries = createAviaries(dogs);
        var sasha = new Cleaner("Sasha");
        var misha = new Cleaner("Misha");
        var alexander = new Veterinarian("Alexander");
        var staffs = List.of(sasha, alexander, misha);

        System.out.printf("A new day begins at the dog farm.%n%n");


        for (var staff : staffs) {
            staff.setAviaries(aviaries);
            staff.doWork();
        }

        for (var dog : dogs) {
            dog.doWork();
        }

        sasha.doWork();

        System.out.println("Another day came to an end at the dog farm.");

    }
}
