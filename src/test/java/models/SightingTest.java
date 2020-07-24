package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class SightingTest {

    @Test
    public void getAnimal_id() {
        Sighting newSighting = Sighting.setUpSighting();
        newSighting.getId();
        assertEquals(newSighting.getAnimal_id(),newSighting.getAnimal_id());
    }

    @Test
    public void getAnimal_location() {
        Sighting newSighting = Sighting.setUpSighting();
        assertEquals("Zone-A",newSighting.getAnimal_location());
    }
}
