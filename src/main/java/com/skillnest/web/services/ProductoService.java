package com.skillnest.web.services;

import java.util.List;

import com.skillnest.web.models.Producto;
import com.skillnest.web.models.ProductoDto;


//aplicar logica de negocio
public interface ProductoService {

    public String obtenerMensaje();
    public String formatearProducto(String nombre, double precio);
    //metodos CRUD
    public Producto guardaProducto(ProductoDto productoDto);
	public List<Producto> listarTodos();
    
    
    
    
}

