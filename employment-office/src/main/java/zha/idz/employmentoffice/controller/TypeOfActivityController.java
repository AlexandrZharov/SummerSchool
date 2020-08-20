package zha.idz.employmentoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zha.idz.employmentoffice.model.TypeOfActivity;
import zha.idz.employmentoffice.service.activity.TypeOfActivityService;

import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 20 авг. 2020
 */
@RequestMapping("/admin/type-of-activity")
@RestController
public class TypeOfActivityController {

    @Autowired
    TypeOfActivityService typeOfActivityService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<TypeOfActivity> getTypesOfActivity() {
        return typeOfActivityService.getAll();
    }
}
