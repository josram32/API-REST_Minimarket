package com.minimarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name= "tbl_TIPO_USUARIO")
@Entity
public class TipoUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ide_tus;
	private String des_tus;
	public int getIde_tus() {
		return ide_tus;
	}
	public void setIde_tus(int ide_tus) {
		this.ide_tus = ide_tus;
	}
	public String getDes_tus() {
		return des_tus;
	}
	public void setDes_tus(String des_tus) {
		this.des_tus = des_tus;
	}
	@Override
	public String toString() {
		return "TipoUsuario [ide_tus=" + ide_tus + ", des_tus=" + des_tus + "]";
	}

}
