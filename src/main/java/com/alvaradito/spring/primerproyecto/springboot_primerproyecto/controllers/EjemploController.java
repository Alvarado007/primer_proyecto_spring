package com.alvaradito.spring.primerproyecto.springboot_primerproyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model){
        model.addAttribute("titulo", "Detalle de la información");
        model.addAttribute("servidor","localhost:8080");
        model.addAttribute("framework","Spring Boot");
        return "detalles_info";
    }
}
