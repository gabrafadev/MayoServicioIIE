package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Productos;

public interface ProductoService {

	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductosId(Integer id);
}
