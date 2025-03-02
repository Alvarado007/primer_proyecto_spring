package com.alvaradito.spring.primerproyecto.springboot_primerproyecto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.dto.ParametroDTO;

@RestController
@RequestMapping("/api/parametros")
public class RquestParamControllers {

    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "si") String informacion) {
        ParametroDTO parametroDTO = new ParametroDTO();
        parametroDTO.setInformacion(informacion);
        return parametroDTO;
    }

}
