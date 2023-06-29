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

import com.minimarket.model.Proveedor;
import com.minimarket.serviceimp.ProveedorServiceImp;
import com.minimarket.utils.NotFoundException;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
	
	@Autowired
	private ProveedorServiceImp servProveedor;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Proveedor> >lista() throws Exception{
		return new ResponseEntity(servProveedor.listarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{codigo}") //   /buscar/4
	public ResponseEntity<Proveedor> buscar(@PathVariable("codigo") Integer cod) throws Exception{
		Proveedor pv = servProveedor.buscarPorCodigo(cod);
		if(pv==null) {
			throw new NotFoundException();
		}
		return new ResponseEntity<>(pv,HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Proveedor> registrar(@RequestBody Proveedor pv) throws Exception{
		Proveedor bean = servProveedor.registrar(pv);
		return new ResponseEntity<>(bean,HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Proveedor> actualizar(@RequestBody Proveedor pv) throws Exception{
		Proveedor bean = servProveedor.buscarPorCodigo(pv.getIde_prv());
		
		if(bean == null) {
			throw new NotFoundException();
		}
		else {
			bean = servProveedor.actualizar(pv);
		}
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) throws Exception{
		
		Proveedor bean = servProveedor.buscarPorCodigo(cod);
		if(bean == null) {
			throw new NotFoundException();
		}
		else {
			servProveedor.eliminar(cod);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}	

}
