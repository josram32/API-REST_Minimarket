package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.Proveedor;
import com.minimarket.repository.IProveedorRepository;

@Service
public class ProveedorServiceImp extends ICRUDImp<Proveedor, Integer>{
	
	@Autowired
	private IProveedorRepository repoProveedor;

	@Override
	public JpaRepository<Proveedor, Integer> getJpaRepository() {
		return repoProveedor;
	}

}
