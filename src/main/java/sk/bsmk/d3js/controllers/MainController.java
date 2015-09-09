package sk.bsmk.d3js.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bsmk on 9/9/15.
 */
@RestController
public class MainController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello";
  }

}
