package models.entity.service;

import java.util.List;

import models.entity.Producto;

public interface IProductoService  {

	public List<Producto> findAll();
	public Producto findID(Long id);
}
