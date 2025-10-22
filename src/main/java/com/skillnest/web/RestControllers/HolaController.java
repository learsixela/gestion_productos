package com.skillnest.web.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.*;

import com.skillnest.web.Component.MiServicio;

//@Slf4j
@RestController
public class HolaController {
	//inyeccion de dependencias
	@Autowired
	MiServicio servicio;

	//http://localhost:8080/mensaje
    @GetMapping("/mensaje")
    public String mensaje() {
        return servicio.obtenerMensaje();
    }

}
