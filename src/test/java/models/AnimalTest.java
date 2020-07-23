package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getAnimal_age() {
        Animal newAnimal = Animal.setUpNewAnimal();
        assertEquals("young",newAnimal.getAnimal_age());
    }

    @Test
    public void setanimal_age() {
        Animal newAnimal = Animal.setUpNewAnimal();
        newAnimal.setAnimal_age("Young");
        assertEquals("Young",newAnimal.getAnimal_age());
    }

    @Test
    public void setId() {
        Animal newAnimal = Animal.setUpNewAnimal();
        newAnimal.setId(3);
        assertEquals(3,newAnimal.getId());
    }
}
