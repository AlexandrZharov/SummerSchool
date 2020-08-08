package zha.edu.myspringapp.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("get/list")
    String showAll() {
        return "chairlist";
    }
}
