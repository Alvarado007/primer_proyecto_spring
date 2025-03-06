package com.alvaradito.spring.primerproyecto.springboot_primerproyecto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.empleados;
import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.dto.ParametroDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @GetMapping("/pagina1/{mensaje}")//mensaje
    public ParametroDTO pagina1(@PathVariable String mensaje) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }
    @PostMapping("/solicitud")//solicitud
    public empleados CrearEmpleado(@RequestBody empleados empleado3){
        return empleado3;
    }
    
    
}
