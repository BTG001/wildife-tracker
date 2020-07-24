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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRanger_name() {
        return ranger_name;
    }

    public void setRanger_name(String ranger_name) {
        this.ranger_name = ranger_name;
    }

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public String getAnimal_location() {
        return animal_location;
    }

    public void setAnimal_location(String animal_location) {
        this.animal_location = animal_location;
    }

}
