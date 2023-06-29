package com.minimarket.serviceimp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minimarket.service.ICRUD;


public abstract class ICRUDImp<T,ID> implements ICRUD<T, ID>{

	public abstract JpaRepository<T, ID> getJpaRepository();
	
	@Override
	public T registrar(T bean) throws Exception {
		// TODO Auto-generated method stub
		return getJpaRepository().save(bean);
	}

	@Override
	public T actualizar(T bean) throws Exception {
		// TODO Auto-generated method stub
		return getJpaRepository().save(bean);
	}

	@Override
	public void eliminar(ID cod) throws Exception {
		getJpaRepository().deleteById(cod);
		
	}

	@Override
	public T buscarPorCodigo(ID cod) throws Exception {
		// TODO Auto-generated method stub
		return getJpaRepository().findById(cod).orElse(null);
	}

	@Override
	public List<T> listarTodos() throws Exception {
		// TODO Auto-generated method stub
		return getJpaRepository().findAll();
	}

}