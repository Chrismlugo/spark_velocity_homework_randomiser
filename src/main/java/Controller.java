import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

import models.NameList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("public");

        get("/randomName/one", (req,res) ->{
            NameList names = new NameList();
            String result = names.getName();
            HashMap<String, Object> model = new HashMap();
            model.put("result", result);
            model.put("template", "randomiser_1.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/randomName/two", (req,res) -> {
            NameList names = new NameList();
            ArrayList<String> results = new ArrayList<>();
            results = names.getPairOfNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("results", results);
            model.put("template", "randomiser_2.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/randomName/three", (req,res) ->{
            NameList names = new NameList();
            ArrayList<String> results = new ArrayList<>();
            results = names.getThreeNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("results", results);
            model.put("template", "randomiser_3.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/randomName/four", (req,res) ->{
            NameList names = new NameList();
            ArrayList<String> results = new ArrayList<>();
            results = names.getFourNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("results", results);
            model.put("template", "randomiser_4.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

    }


}
