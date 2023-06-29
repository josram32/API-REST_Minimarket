package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.TipoUsuario;
import com.minimarket.repository.ITipoUsuarioRepository;

@Service
public class TipoUsuarioServiceImp extends ICRUDImp<TipoUsuario, Integer>{

	@Autowired
	private ITipoUsuarioRepository repo;
	
	@Override
	public JpaRepository<TipoUsuario, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

}
