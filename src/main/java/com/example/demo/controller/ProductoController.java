package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Productos;
import com.example.demo.service.ProductoService;

@Controller
@RequestMapping("/producto/v1")
public class ProductoController {

	@Autowired
	public ProductoService service;
	
	@RequestMapping("/listar")
	public @ResponseBody List<Productos> listar() {
		return null;

	}

	


}
