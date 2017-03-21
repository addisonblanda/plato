package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello! This is a demo application linked to this tutorial: http://jkutner.github.io/2016/08/18/android-backend-api-heroku-retrofit.html";
  }

  @RequestMapping("/hello")
  @ResponseBody
  String hello() {
    return "Hello from Heroku!";
  }
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<String> get(@PathVariable("id") String id) {
    String str = "Hello there." + id;
    return new ResponseEntity<String>(str);
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
