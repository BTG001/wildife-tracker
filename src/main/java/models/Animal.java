package models;

import interfaces.AnimalInterface;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animal implements AnimalInterface {


    private int animal_id;
    private String animal_name;
    private String animal_health;
    private String animal_age;
    private int id;

    public Animal(int animal_id, String animal_name) {
        this.animal_id = animal_id;
        this.animal_name = animal_name;
        this.id = 0;
    }

    public static Animal setUpNewAnimal() {
        return new Animal(1, "Koala Bear");
    }


    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_health() {
        return animal_health;
    }

    public void setAnimal_health(String animal_health) {
        this.animal_health = animal_health;
    }

    public String getAnimal_age() {
        return animal_age;
    }

    public void setAnimal_age(String animal_age) {
        this.animal_age = animal_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}