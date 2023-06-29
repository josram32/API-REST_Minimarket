package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.UnidadMedida;
import com.minimarket.repository.IUnidadMedidaRepository;

@Service
public class UnidadMedidaServiceImp extends ICRUDImp<UnidadMedida, Integer>{
	
	@Autowired
	private IUnidadMedidaRepository repo;
	
	@Override
	public JpaRepository<UnidadMedida, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

}
