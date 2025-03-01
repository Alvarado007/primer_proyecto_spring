package com.alvaradito.spring.primerproyecto.springboot_primerproyecto.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.empleados;
import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.dto.ClaseDTO;



@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    
    public ClaseDTO detalles_info2(){
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Juan");
        return usuario1;
    }
}
