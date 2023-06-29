package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.TipoComprobante;
import com.minimarket.repository.ITipoComprobanteRepository;

@Service
public class TipoComprobanteServiceImp extends ICRUDImp<TipoComprobante, Integer>{

	@Autowired
	private ITipoComprobanteRepository repo;
	
	@Override
	public JpaRepository<TipoComprobante, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

}
