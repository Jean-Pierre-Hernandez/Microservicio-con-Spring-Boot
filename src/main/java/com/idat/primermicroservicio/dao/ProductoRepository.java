package com.idat.primermicroservicio.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.primermicroservicio.entity.Producto;


@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{

	
}
