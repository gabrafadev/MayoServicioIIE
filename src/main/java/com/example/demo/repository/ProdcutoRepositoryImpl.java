package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Productos;


@Repository
public class ProdcutoRepositoryImpl implements ProductoRepository {

	public List<Productos> listar = new ArrayList<Productos>();
	
	
	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.add(null);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub

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
		
		//if(listar != null) {
			//for (Productos productos: listar) {
				//if(productos.getIdProducto()==id)
					//return productos;
			//}
		//}
		//return null;
		return listar.stream().filter(p -> p.getIdProducto()== id).findFirst().orElse(null);
		//return listar.stream().filter(p ->p.getIdProducto()== id).findFirst().orElse(null);
		//return listar.stream().filter(pepelucho);
	}

}
