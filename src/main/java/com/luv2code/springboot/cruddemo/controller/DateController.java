package com.luv2code.springboot.cruddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * @author Wojciech Wasilewski
 * @date Created on 11.07.2019
 */
@Controller
public class DateController {

    @GetMapping("/date")
    public String getDate(Model model) {

        model.addAttribute("theDate", new Date());
        return "date";
    }
}
