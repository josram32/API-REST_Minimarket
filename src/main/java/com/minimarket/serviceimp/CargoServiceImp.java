package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.Cargo;
import com.minimarket.repository.ICargoRepository;

@Service
public class CargoServiceImp extends ICRUDImp<Cargo, Integer>{

	@Autowired
	private ICargoRepository repo;
	
	@Override
	public JpaRepository<Cargo, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

}
