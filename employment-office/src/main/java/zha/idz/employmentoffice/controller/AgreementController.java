package zha.idz.employmentoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zha.idz.employmentoffice.model.Agreement;
import zha.idz.employmentoffice.service.agreement.AgreementService;

import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 19 авг. 2020
 */
@RequestMapping("/admin/agreement")
@RestController
public class AgreementController {

    @Autowired
    AgreementService agreementService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Agreement> getAgreements() {
        return agreementService.getAll();
    }
}
