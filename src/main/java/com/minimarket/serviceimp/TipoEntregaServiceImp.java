package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.TipoEntrega;
import com.minimarket.repository.ITipoEntregaRepository;

@Service
public class TipoEntregaServiceImp extends ICRUDImp<TipoEntrega, Integer>{

	@Autowired
	private ITipoEntregaRepository repo;
	@Override
	public JpaRepository<TipoEntrega, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

}
