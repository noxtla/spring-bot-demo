package models.entity.dao;

import org.springframework.data.repository.CrudRepository;

import models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>
{
	
	
}
