package zha.edu.myspringapp.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zha.edu.myspringapp.service.chair.ChairService;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 08 авг. 2020
 */
@Controller
@RequestMapping("/web/chair")
public class ChairWebController {

    @Autowired
    ChairService chairService;

    @RequestMapping("/get/list")
    String showAll(Model model) {
        model.addAttribute("list", chairService.getAll());
        return "chairlist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCafedra(@PathVariable("id") String id, Model model){
        chairService.delete(id);
        model.addAttribute("list",chairService.getAll());
        return "redirect:/web/chair/get/list";
    }
}
