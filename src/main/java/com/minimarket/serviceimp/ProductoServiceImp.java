package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.Producto;
import com.minimarket.repository.IProductoRepository;

@Service
public class ProductoServiceImp extends ICRUDImp<Producto, Integer> {

	@Autowired
	private IProductoRepository repoProducto;
	@Override
	public JpaRepository<Producto, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repoProducto;
	}

}
