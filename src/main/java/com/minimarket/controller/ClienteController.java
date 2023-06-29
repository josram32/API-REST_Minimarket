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

import com.minimarket.model.Cliente;
import com.minimarket.model.Proveedor;
import com.minimarket.serviceimp.ClienteServiceImp;
import com.minimarket.serviceimp.ProveedorServiceImp;
import com.minimarket.utils.NotFoundException;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteServiceImp servCliente;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Cliente> >lista() throws Exception{
		return new ResponseEntity(servCliente.listarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{codigo}") //   /buscar/4
	public ResponseEntity<Cliente> buscar(@PathVariable("codigo") Integer cod) throws Exception{
		Cliente c = servCliente.buscarPorCodigo(cod);
		if(c==null) {
			throw new NotFoundException();
		}
		return new ResponseEntity<>(c,HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Cliente> registrar(@RequestBody Cliente c) throws Exception{
		Cliente bean = servCliente.registrar(c);
		return new ResponseEntity<>(bean,HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Cliente> actualizar(@RequestBody Cliente c) throws Exception{
		Cliente bean = servCliente.buscarPorCodigo(c.getIde_cli());
		
		if(bean == null) {
			throw new NotFoundException();
		}
		else {
			bean = servCliente.actualizar(c);
		}
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) throws Exception{
		
		Cliente bean = servCliente.buscarPorCodigo(cod);
		if(bean == null) {
			throw new NotFoundException();
		}
		else {
			servCliente.eliminar(cod);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}	

}
