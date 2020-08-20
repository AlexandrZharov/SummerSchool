package zha.idz.employmentoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zha.idz.employmentoffice.model.Employer;
import zha.idz.employmentoffice.service.employer.EmployerService;

import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 19 авг. 2020
 */
@RequestMapping("/admin/employer")
@RestController
public class EmployerController {

    @Autowired
    EmployerService employerService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Employer> getEmployers() {
        return employerService.getAll();
    }
}
