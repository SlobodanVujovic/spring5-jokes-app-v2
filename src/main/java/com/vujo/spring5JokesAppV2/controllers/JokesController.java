package com.vujo.spring5JokesAppV2.controllers;

import com.vujo.spring5JokesAppV2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping()
    public String getJoke(Model model){
        String joke = this.jokesService.getJoke();

        model.addAttribute("joke", joke);

        return "index";
    }
}
