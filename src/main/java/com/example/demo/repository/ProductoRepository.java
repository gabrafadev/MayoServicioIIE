package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Productos;

public interface ProductoRepository {

	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductosId(Integer id);
}
