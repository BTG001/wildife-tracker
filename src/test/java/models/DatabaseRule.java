package models;

import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DatabaseRule extends ExternalResource {
    @Override
    protected void before() {
        Database.sql2o = new Sql2o("jdbc:postgresql://localhost:4567/wildlife_tracker", "postgres", "postgres");
    }

    @Override
    protected void after() {
        try(Connection con = Database.sql2o.open()) {
            String deleteAnimalQuery = "DELETE FROM animal *;";
            String deleteSightingsQuery = "DELETE FROM sightings *;";
            con.createQuery(deleteAnimalQuery).executeUpdate();
            con.createQuery(deleteSightingsQuery).executeUpdate();
        }
    }

}
