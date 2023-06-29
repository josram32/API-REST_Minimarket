package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.Categoria;
import com.minimarket.repository.ICategoriaRepository;

@Service
public class CategoriaServiceImp extends ICRUDImp<Categoria, Integer> {
	
	@Autowired
	private ICategoriaRepository repo;
	
	@Override
	public JpaRepository<Categoria, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

}
