package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Productos;
import com.example.demo.service.ProductoService;

@Controller
@RequestMapping("/producto/v1")
public class ProductoController {

	@Autowired
	public ProductoService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Productos>> listar() {
		return new ResponseEntity<List<Productos>>(service.listarProductos(),HttpStatus.OK);

	}
	
	@RequestMapping(path ="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar (@RequestBody Productos productos) {
		service.guardarProducto(productos);
		return new ResponseEntity<Void>(HttpStatus.CREATED);

	}

	


}
