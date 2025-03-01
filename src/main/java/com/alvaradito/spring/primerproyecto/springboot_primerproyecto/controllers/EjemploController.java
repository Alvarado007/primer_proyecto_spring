package com.alvaradito.spring.primerproyecto.springboot_primerproyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.empleados;



@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model){ //dto tranfiero los datos desde model hacia mi vista 
        empleados empleado1 = new empleados("Juan", "Perez", "Calle 123", "Gerente", 30, 12345678, 01);
        model.addAttribute("empleado", empleado1);
        return "detalles_info";
    }
}
