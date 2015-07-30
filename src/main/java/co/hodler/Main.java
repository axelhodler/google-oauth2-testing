package co.hodler;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Spark;

public class Main {

  public static void main(String[] args) {
    Spark.get("/hello", (request, response) -> {
      Map<String, Object> attributes = new HashMap<>();
      attributes.put("message", "Hello FreeMarker World");

      return new ModelAndView(attributes, "index.html");
  }, new FreeMarkerTemplateEngine());
  }
}
