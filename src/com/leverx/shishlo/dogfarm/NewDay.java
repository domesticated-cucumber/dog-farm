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
        var grisha = new Cleaner("Grisha");
        var misha = new Cleaner("Misha");
        var alexander = new Veterinarian("Alexander");
        var staffs = List.of(grisha, alexander, misha);

        System.out.printf("A new day begins at the dog farm.%n%n");


        for (var staff : staffs) {
            staff.setAviaries(aviaries);
            staff.doWork();
        }

        for (var dog : dogs) {
            dog.doWork();
        }

        grisha.doWork();

        System.out.println("Another day came to an end at the dog farm.");

    }
}
