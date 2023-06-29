package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.TipoPago;
import com.minimarket.repository.ITipoPagoRepository;

@Service
public class TipoPagoServiceImp extends ICRUDImp<TipoPago, Integer>{
	
	@Autowired
	private ITipoPagoRepository repo;
	
	@Override
	public JpaRepository<TipoPago, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	

}
