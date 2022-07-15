package com.idat.primermicroservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.primermicroservicio.entity.Producto;
import com.idat.primermicroservicio.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService servicio;
	
	@GetMapping("/all")
	public @ResponseBody List<Producto> listarProductos(){
		return servicio.listarProducto();			
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Producto ObtenerProductoId(@PathVariable Integer id) {
		return servicio.productoPorId(id);
	}
	@DeleteMapping("/{id}")
	public void EliminarProducto(@PathVariable Integer id) {
		servicio.eliminarProductoId(id);
	}
	@PostMapping("/")
	public void GuardarProducto(@RequestBody Producto producto) {
		servicio.guardarProducto(producto);
	}

}
