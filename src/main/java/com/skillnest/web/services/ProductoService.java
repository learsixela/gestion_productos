package com.skillnest.web.services;

import org.springframework.stereotype.Service;

import com.skillnest.web.models.ProductoDto;

@Service
//aplicar logica de negocio
public interface ProductoService {

    public String obtenerMensaje();
    public String formatearProducto(String nombre, double precio);
    //metodos CRUD
    public void guardaProducto(ProductoDto productoDto);
    
    
    
    
}

