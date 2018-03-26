package com.formation.annuaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/test")
    public String test(@RequestParam(required=false)String name, Model model) {
        name = "parametre name";
        model.addAttribute("name", name);
        return "/index";
    }

}
