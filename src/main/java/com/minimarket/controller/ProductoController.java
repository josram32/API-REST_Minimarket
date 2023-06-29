package com.minimarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minimarket.model.Producto;
import com.minimarket.serviceimp.ProductoServiceImp;
import com.minimarket.utils.NotFoundException;
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoServiceImp servProducto;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Producto> >lista() throws Exception{
		return new ResponseEntity(servProducto.listarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Producto>buscar(@PathVariable("codigo") Integer cod) throws Exception{
		Producto p = servProducto.buscarPorCodigo(cod);
		if(p==null) {
			throw new NotFoundException();
		}
		return new ResponseEntity(p,HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Producto> registrar(@RequestBody Producto p) throws Exception{
		Producto bean = servProducto.registrar(p);
		return new ResponseEntity<>(bean,HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Producto> actualizar(@RequestBody Producto p) throws Exception{
		Producto bean = servProducto.buscarPorCodigo(p.getIde_pro());
		
		if(bean == null) {
			throw new NotFoundException();
		}
		else {
			bean = servProducto.actualizar(p);
		}
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) throws Exception{
		
		Producto bean = servProducto.buscarPorCodigo(cod);
		if(bean == null) {
			throw new NotFoundException();
		}
		else {
			servProducto.eliminar(cod);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
