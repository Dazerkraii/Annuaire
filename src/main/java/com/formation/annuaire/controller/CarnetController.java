package com.formation.annuaire.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.formation.annuaire.entite.Carnet;
import com.formation.annuaire.service.CarnetService;

@RestController
public class CarnetController {

    @Autowired
    private CarnetService carnetService;
    //  Pour une api REST (advanced REST Client)
    //    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    //    public List<Carnet> findAll() {
    //        // TODO Auto-generated method stub
    //        return carnetService.getAll();
    //    }

    // Pour envoyer vers une vue
    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public ModelAndView getAll() {
        ModelAndView mav = new ModelAndView("/index");
        mav.addObject("carnets", carnetService.getAll());
        return mav;
    }

    // Pour une api REST
    //    @RequestMapping(value = "/contacts/{id}", method = RequestMethod.GET)
    //    public Carnet getById(@PathVariable Integer id) {
    //        return carnetService.getById(id);
    //    }
    @RequestMapping(value = "/contacts/{id}", method = RequestMethod.GET)
    public ModelAndView getById(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("/index");
        mav.addObject("carnets", carnetService.getById(id));
        return mav;
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    public void addCarnet(@RequestBody Carnet carnet) {
        System.out.println(carnet.toString());
        carnetService.add(carnet);
    }

    @PostMapping(value = "/ajout")
    public void addByForm(@ModelAttribute("ajoutCarnet") @Valid Carnet carnetToAdd, HttpServletResponse response) throws IOException {
        carnetService.add(carnetToAdd);
        response.sendRedirect("/contacts");
    }

}
