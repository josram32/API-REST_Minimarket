package com.minimarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minimarket.model.Usuario;
import com.minimarket.serviceimp.UsuarioServiceImp;

@RestController
@RequestMapping("/")
public class LoginController {

	@Autowired
	private UsuarioServiceImp servUsuario;

	@PostMapping("login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario u) {
		Usuario bean = servUsuario.login(u.getCorreo(), u.getClave());
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	

}
