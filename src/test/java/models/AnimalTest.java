package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getAnimal_age() {
        Animal newAnimal = Animal.setUpNewAnimal();
        assertEquals("young",newAnimal.getAnimal_age());
    }
}
