package models;

import org.sql2o.Connection;

import java.sql.ResultSet;
import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

public class Sighting {
    private String animal_location;
    private String ranger_name;
    private int animal_id;
    private int id;
    private DateTimeFormatter time;
//    private static ArrayList<Animal> allAnimals = new ArrayList<>();

    public Sighting(int animalId,String location, String rangerName){
        this.animal_location = location;
        this.ranger_name = rangerName;
        this.animal_id = animalId;
        this.id = 0;
    }
    public static Sighting setUpSighting() {
        return new Sighting(1, "Zone-A", "Cliff");
    }

}
