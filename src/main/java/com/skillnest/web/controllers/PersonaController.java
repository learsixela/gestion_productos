package com.skillnest.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skillnest.web.models.Persona;
import com.skillnest.web.services.PersonaService;

@Controller
@RequestMapping("/personas")
public class PersonaController {
	@Autowired
	PersonaService personaService;
	
    @GetMapping("/crear")
    public String mostrarFormulario() {
        return "personas/crear";
    }

    @PostMapping("/guardar")
    public String guardarPersona(@RequestParam String nombre, @RequestParam String email, Model model) {
        
    	//intancia de la clase
    	Persona persona = new Persona();
    	//llenar los atributos
    	persona.setNombre(nombre);
    	persona.setEmail(email);
    	
    	//pasamos el objeto
    	personaService.registrarPersona(persona);
    	
    	model.addAttribute("nombre", nombre);
        model.addAttribute("email", email);
        return "personas/detalles";
    }
}
