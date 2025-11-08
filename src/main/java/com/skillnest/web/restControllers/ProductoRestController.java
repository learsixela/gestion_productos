package com.skillnest.web.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillnest.web.models.Producto;
import com.skillnest.web.services.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoRestController {

    @Autowired
    private ProductoService productoService;
	
	@GetMapping("/")
    public List<Producto> listar() {
        return productoService.listarTodos();
    }
}
