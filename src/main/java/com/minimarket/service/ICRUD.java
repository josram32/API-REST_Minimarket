package com.minimarket.service;

import java.util.List;

public interface ICRUD<T,ID> {
	T registrar(T bean) throws Exception; 
	T actualizar(T bean) throws Exception;
	void eliminar(ID cod) throws Exception;
	T buscarPorCodigo(ID cod) throws Exception; 
	List<T> listarTodos() throws Exception;

}
