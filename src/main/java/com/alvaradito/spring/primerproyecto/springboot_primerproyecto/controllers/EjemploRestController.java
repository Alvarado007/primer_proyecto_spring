package com.alvaradito.spring.primerproyecto.springboot_primerproyecto.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    
    public Map<String, Object> detalles_info2(){
        Map<String, Object> model = new HashMap<>();
        model.put("titulo", "Detalle de la información");
        model.put("servidor","localhost:8080");
        model.put("framework","Spring Boot");
        return model;
    }
}
