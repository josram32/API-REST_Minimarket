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
import com.minimarket.model.Usuario;
import com.minimarket.serviceimp.UsuarioServiceImp;
import com.minimarket.utils.NotFoundException;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceImp servUsuario;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Usuario> >lista() throws Exception{
		return new ResponseEntity(servUsuario.listarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{codigo}") //   /buscar/4
	public ResponseEntity<Usuario> buscar(@PathVariable("codigo") Integer cod) throws Exception{
		Usuario usu = servUsuario.buscarPorCodigo(cod);
		if(usu==null) {
			throw new NotFoundException();
		}
		return new ResponseEntity<>(usu,HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Usuario> registrar(@RequestBody Usuario usu) throws Exception{
		Usuario bean = servUsuario.registrar(usu);
		return new ResponseEntity<>(bean,HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Usuario> actualizar(@RequestBody Usuario usu) throws Exception{
		Usuario bean = servUsuario.buscarPorCodigo(usu.getIde_usu());
		
		if(bean == null) {
			throw new NotFoundException();
		}
		else {
			bean = servUsuario.actualizar(usu);
		}
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) throws Exception{
		
		Usuario bean = servUsuario.buscarPorCodigo(cod);
		if(bean == null) {
			throw new NotFoundException();
		}
		else {
			servUsuario.eliminar(cod);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}	

}
