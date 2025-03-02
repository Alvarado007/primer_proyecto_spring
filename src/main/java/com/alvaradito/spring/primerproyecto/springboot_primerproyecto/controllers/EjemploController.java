package com.alvaradito.spring.primerproyecto.springboot_primerproyecto.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.empleados;



@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model){ //dto tranfiero los datos desde model hacia mi vista 
        empleados empleado1 = new empleados("Juan", "Perez", "tu mama", "Gerente", 30, 12345678, 01);
        model.addAttribute("empleado", empleado1);
        model.addAttribute("titulo", "Detalle del empleado: ");
        return "detalles_info";
    }

    @ModelAttribute("empleados")
    public List<empleados> empleados(){
        return Arrays.asList(
            new empleados("Codi", "devore", "tu mama", "Secretaria premium", 30, 12345674, 02),
            new empleados("sam", "perez", "tu mama", "Gerente", 30, 12345678, 03),
            new empleados("Juan", "Perez", "tu mama", "Gerente", 30, 12345678, 01),
            new empleados("Juan", "Perez", "tu mama", "Gerente", 30, 12345678, 01)
        );
    }
}
