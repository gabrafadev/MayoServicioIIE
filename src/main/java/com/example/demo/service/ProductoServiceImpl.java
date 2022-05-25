package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Productos;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repository.guardarProducto(producto);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repository.actualizarProducto(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos obtenerProductosId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
