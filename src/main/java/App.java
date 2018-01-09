

import models.Beer;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {

    public static void main(String[] args) {

        staticFileLocation("public");

        Beer mamba = new Beer("Mamba", "Gilgamesh", "Spiced Tea Ale", "7", "0");
        Beer crush = new Beer("Rasberry Crush", "10 Barrel Brewing", "Sour", "6.5", "7");
        Beer sang = new Beer("Sang Noir", "Cascade Brewing", "Sour", "10.1", "0");
        Beer mango = new Beer("Mango Cart", "Golden Road", "Mango Wheat Ale", "4.0", "10");
        Beer avatar = new Beer("Avatar", "Elysian", "Jasmine IPA", "6.3", "45");
        Beer fivePine = new Beer("Five Pine", "Three Creeks Brewing Company", "Chocolate Porter", "6.2", "40");
        ArrayList<Beer> beers = Beer.getAll();

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("beers", beers);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/comments/new", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "add-comment-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/comments/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int index = Integer.parseInt(request.queryParams("beer"));
            String name = request.queryParams("name");
            String comment = request.queryParams("comment");
            beers.get(index).setComments(name, comment);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
