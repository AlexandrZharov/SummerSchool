package zha.idz.employmentoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zha.idz.employmentoffice.model.Vacancy;
import zha.idz.employmentoffice.service.vacancy.VacancyService;

import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 20 авг. 2020
 */
@RequestMapping("/admin/vacancy")
@RestController
public class VacancyController {

    @Autowired
    VacancyService vacancyService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Vacancy> getTypesOfActivity() {
        return vacancyService.getAll();
    }
}
