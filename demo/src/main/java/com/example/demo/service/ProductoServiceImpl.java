package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ProductoDao;
import com.example.demo.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	
	@Autowired
	private ProductoDao productoDao;
	
	

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>)productoDao.findAll();
	}	

	@Override
	@Transactional(readOnly = true)
	public Producto findID(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

	
	

}
