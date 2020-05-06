package models.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import models.entity.Producto;
import models.entity.dao.ProductoDao;


///Registrar la clase como un componente

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
