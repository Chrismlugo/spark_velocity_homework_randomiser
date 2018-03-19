import static spark.Spark.get;
import models.NameList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/randomName/one", (req,res) ->{
            NameList names = new NameList();
            String result = names.getName();
            HashMap<String, Object> model = new HashMap();
            model.put("result", result);
            return new ModelAndView(model, "randomiser_1.vtl");
        }, velocityTemplateEngine);

        get("/randomName/two", (req,res) -> {
            NameList names = new NameList();
            ArrayList<String> results = new ArrayList<>();
            results = names.getPairOfNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("results", results);
            return new ModelAndView(model, "randomiser_2.vtl");
        }, velocityTemplateEngine);

    }


}
