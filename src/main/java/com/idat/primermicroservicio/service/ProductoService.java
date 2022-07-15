package com.idat.primermicroservicio.service;

import java.util.List;

import com.idat.primermicroservicio.entity.Producto;

public interface ProductoService {
	
	List<Producto>listarProducto();
	Producto productoPorId(Integer id);
	void eliminarProductoId(Integer id);
	void guardarProducto(Producto producto);
}
