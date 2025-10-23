package com.skillnest.web.services;

import org.springframework.stereotype.Service;

@Service
//aplicar logica de negocio
public class ProductoService {

    public String obtenerMensaje() {
        return "¡Servicio funcionando!";
    }
    
    public String formatearProducto(String nombre, double precio) {
        return "Producto: " + nombre + ", Precio: $" + precio;
    }
}

