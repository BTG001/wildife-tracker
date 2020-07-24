import static spark.Spark.*;

import models.Animal;
import models.EndangeredAnimal;
import models.Sighting;
import org.sql2o.Connection;
import spark.ModelAndView;
import spark.template.handlebars.*;

import java.util.HashMap;
import java.util.Map;


public class App {

    public static void main(String[] args) {

        Connection conn;
        staticFileLocation("/public");

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("allEndangered", EndangeredAnimal.getAllAnimals());
            model.put("allAnimals", Animal.getAllAnimals());
            model.put("allSightings", Sighting.allSightings());
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}