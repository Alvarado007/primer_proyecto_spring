package com.alvaradito.spring.primerproyecto.springboot_primerproyecto.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.empleados;
import com.alvaradito.spring.primerproyecto.springboot_primerproyecto.models.dto.ParametroDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/variable")
public class PathVariableController {
    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.valores}")
    private String[] valores;


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

    @GetMapping("/valores")//valores
    public Map<String, Object> values(){
    Map<String, Object> json= new HashMap<>();
    json.put("usuario", usuario);
    json.put("mensaje", mensaje);
    json.put("codigo", codigo);
    json.put("valores", valores);
    return json;
    } //se trabajo en maven para que se pudiera correr el proyecto
}
