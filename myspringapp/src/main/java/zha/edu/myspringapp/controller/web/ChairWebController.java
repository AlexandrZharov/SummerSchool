package zha.edu.myspringapp.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zha.edu.myspringapp.form.ChairForm;
import zha.edu.myspringapp.model.Chair;
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
    String deleteChair(@PathVariable("id") String id, Model model){
        chairService.delete(id);
        model.addAttribute("list",chairService.getAll());
        return "redirect:/web/chair/get/list";
    }

    @RequestMapping(value = "/refresh", method = RequestMethod.GET)
    String refresh() {
        chairService.refresh();
        return "redirect:/web/chair/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createChair(Model model){
        ChairForm chairForm = new ChairForm();

        model.addAttribute("chairForm", chairForm);
        return "chairForm";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createChair(@ModelAttribute("chairForm") ChairForm chairForm){
        Chair chair = new Chair(chairForm.getName(), chairForm.getChief(), chairForm.getDescription());
        chairService.create(chair);
        return "redirect:/web/chair/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String createChair(Model model, @PathVariable("id") String id){
        Chair chair = chairService.get(id);
        ChairForm chairForm = new ChairForm(
                chair.getId(),
                chair.getName(),
                chair.getChief(),
                chair.getDescription()
        );

        model.addAttribute("chairForm", chairForm);
        return "chairForm";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String createChair(@PathVariable("id") String id, @ModelAttribute("chairForm") ChairForm chairForm){
        Chair chair = new Chair(chairForm.getName(), chairForm.getChief(), chairForm.getDescription());
        chair.setId(id);
        chairService.update(chair);
        return "redirect:/web/chair/get/list";
    }
}
