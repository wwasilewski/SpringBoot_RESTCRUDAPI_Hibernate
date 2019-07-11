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
public class IndexController {

    @GetMapping({"/index", "/", ""})
    public String getIndex(Model model) {

        model.addAttribute("theIndex", new Date());
        return "index";
    }
}
