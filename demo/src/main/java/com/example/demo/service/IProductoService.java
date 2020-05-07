package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Producto;


public interface IProductoService  {

	public List<Producto> findAll();
	public Producto findID(Long id);
}
