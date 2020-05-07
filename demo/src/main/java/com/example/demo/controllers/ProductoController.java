package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Producto;
import com.example.demo.service.IProductoService;


@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService productoSer;

	
	@GetMapping("/listar")
	public List <Producto> listar(){
		
		return productoSer.findAll();
	}
	
	
	@GetMapping("/ver/{id}")
	public Producto detalle (@PathVariable Long id) {
		
		return productoSer.findID(id);
	}

}
