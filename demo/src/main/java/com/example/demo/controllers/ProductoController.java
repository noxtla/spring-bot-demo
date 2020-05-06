package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import models.entity.Producto;
import models.entity.service.IProductoService;



///Convertir a JSON los metodos handler del controlador 

@RestController
public class ProductoController {
	
	@Autowired
	
	private IProductoService productoService;
	
	
	
	///Lo mapeamos a una ruta a un end point
	///A traves de esta ruta se van a comunicar los otros servicios
	@GetMapping("/listar")
	///Metodo comun y corriente
	
	public List <Producto> listar(){
		
		return productoService.findAll();
	}
	
	
	@GetMapping("/listar{id}")
	public Producto detalle (@PathVariable Long id) {
		
		return productoService.findID(id);
	}

}
