package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.Cliente;
import com.minimarket.repository.IClienteRepository;

@Service
public class ClienteServiceImp extends ICRUDImp<Cliente, Integer> {
	
	@Autowired
	private IClienteRepository repoCliente;

	@Override
	public JpaRepository<Cliente, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repoCliente;
	}

}
