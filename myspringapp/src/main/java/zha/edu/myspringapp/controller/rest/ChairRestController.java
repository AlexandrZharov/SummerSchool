package zha.edu.myspringapp.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zha.edu.myspringapp.model.Chair;
import zha.edu.myspringapp.service.chair.ChairService;

import java.util.List;
@RequestMapping("/api/chair")
@RestController
public class ChairRestController {

    @Autowired
    ChairService chairService;

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Chair Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Chair> getChairs() {
        return chairService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Chair getChairById(@PathVariable("id") String id) {
        return chairService.get(id);
    }

}
