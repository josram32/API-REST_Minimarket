package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.TipoDocumento;
import com.minimarket.repository.ITipoDocumentoRepository;

@Service
public class TipoDocumentoServiceImp extends ICRUDImp<TipoDocumento, Integer>{

	@Autowired
	private ITipoDocumentoRepository repo;
	
	@Override
	public JpaRepository<TipoDocumento, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}
}
