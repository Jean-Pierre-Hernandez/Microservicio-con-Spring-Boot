package com.idat.primermicroservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.primermicroservicio.dao.ProductoRepository;
import com.idat.primermicroservicio.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> listarProducto() {
		return (List<Producto>) repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto productoPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void eliminarProductoId(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void guardarProducto(Producto producto) {
		repository.save(producto);
	}

}
