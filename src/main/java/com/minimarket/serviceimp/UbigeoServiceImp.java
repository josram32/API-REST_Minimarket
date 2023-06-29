package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.Ubigeo;
import com.minimarket.repository.IUbigeoRepository;

@Service
public class UbigeoServiceImp extends ICRUDImp<Ubigeo, String>{
	
	@Autowired
	private IUbigeoRepository repo;
	
	@Override
	public JpaRepository<Ubigeo, String> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}
}
