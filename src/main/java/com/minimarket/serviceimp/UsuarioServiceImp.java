package com.minimarket.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minimarket.model.Usuario;
import com.minimarket.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImp extends ICRUDImp<Usuario,Integer> {
	
	@Autowired
	private IUsuarioRepository repoUsuario;
	@Override
	public JpaRepository<Usuario, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repoUsuario;
	}
	
	public Usuario login(String email, String clave) {
        Usuario usuario = repoUsuario.findByCorreoAndClave(email,clave);
        if (usuario != null && usuario.getClave().equals(clave)) {
            return usuario;
        } else {
            return null;
        }
    }

}
