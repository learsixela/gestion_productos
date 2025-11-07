package com.skillnest.web.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.skillnest.web.models.Producto;
import com.skillnest.web.models.ProductoDto;
import com.skillnest.web.repositories.ProductoRepository;

public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository productoRepository;
	
	@Override
    public String obtenerMensaje() {
        return "¡Servicio funcionando!";
    }
	
    @Override
    public String formatearProducto(String nombre, double precio) {
        return "Producto: " + nombre + ", Precio: $" + precio;
    }

	@Override
	public void guardaProducto(ProductoDto productoDto) {
		Producto producto = new Producto();
		producto.setNombre(productoDto.getNombre());
		producto.setCantidad(productoDto.getCantidad());
		producto.setPrecio(productoDto.getPrecio());
		producto.setDetalle(productoDto.getDetalle());
		
		productoRepository.save(producto);
	}
    
    
}

