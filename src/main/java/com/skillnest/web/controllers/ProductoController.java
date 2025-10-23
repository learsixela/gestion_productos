package com.skillnest.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skillnest.web.services.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
    @Autowired
    private ProductoService productoService;
    
	//http://localhost:8080/productos/listar
    @GetMapping("/listar")
    public String listarProductos() {
        return "productos/listar";//hacia un jsp
    }

    @GetMapping("/crear")
    public String formularioCrear() {
        return "productos/crear";//hacia un jsp
    }
    
    @PostMapping("/guardar")
    public String guardarProducto(@RequestParam String nombre, @RequestParam double precio,Model model) {
        // Procesar los datos
    	String mensaje = productoService.formatearProducto(nombre, precio);
    	
    	model.addAttribute("mensaje", mensaje);
        model.addAttribute("nombre", nombre);
        model.addAttribute("precio", precio);
        return "productos/detalle";
        //return "redirect:/productos/listar";//http://localhost:8080/productos/listar

    }
    
    @GetMapping("/detalle")
    public String verDetalle(Model model) {
        model.addAttribute("mensaje", "Producto destacado");
        return "productos/detalle";//hacia un jsp
    }

    @GetMapping("/mensaje")
    public String mostrarMensaje(Model model) {
        //String mensaje = productoService.obtenerMensaje();
        model.addAttribute("mensaje", productoService.obtenerMensaje());
        
        return "productos/detalle"; // Renderiza 
    }
}