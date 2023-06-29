package com.minimarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minimarket.model.Cargo;
import com.minimarket.model.Categoria;
import com.minimarket.model.TipoComprobante;
import com.minimarket.model.TipoDocumento;
import com.minimarket.model.TipoEntrega;
import com.minimarket.model.TipoPago;
import com.minimarket.model.TipoUsuario;
import com.minimarket.model.Ubigeo;
import com.minimarket.model.UnidadMedida;
import com.minimarket.serviceimp.CargoServiceImp;
import com.minimarket.serviceimp.CategoriaServiceImp;
import com.minimarket.serviceimp.TipoComprobanteServiceImp;
import com.minimarket.serviceimp.TipoDocumentoServiceImp;
import com.minimarket.serviceimp.TipoEntregaServiceImp;
import com.minimarket.serviceimp.TipoPagoServiceImp;
import com.minimarket.serviceimp.TipoUsuarioServiceImp;
import com.minimarket.serviceimp.UbigeoServiceImp;
import com.minimarket.serviceimp.UnidadMedidaServiceImp;

@RestController
@RequestMapping("/util")
public class UtilsController {
	
	@Autowired
	private CargoServiceImp cargoServ;
	
	@GetMapping("/cargo")
	public ResponseEntity<List<Cargo> >cargos() throws Exception{
		return new ResponseEntity(cargoServ.listarTodos(),HttpStatus.OK);
	}
	
	@Autowired
	private CategoriaServiceImp categoriaServ;
	
	@GetMapping("/categoria")
	public ResponseEntity<List<Categoria> >categorias() throws Exception{
		return new ResponseEntity(categoriaServ.listarTodos(),HttpStatus.OK);
	}
	
	@Autowired
	private TipoComprobanteServiceImp tipoComprobanteServ;
	
	@GetMapping("/tipoComprobante")
	public ResponseEntity<List<TipoComprobante> >tiposComprobantes() throws Exception{
		return new ResponseEntity(tipoComprobanteServ.listarTodos(),HttpStatus.OK);
	}
	
	@Autowired
	private TipoDocumentoServiceImp tipoDocumentoServ;
	
	@GetMapping("/tipoDocumento")
	public ResponseEntity<List<TipoDocumento> >tipoDocumento() throws Exception{
		return new ResponseEntity(tipoDocumentoServ.listarTodos(),HttpStatus.OK);
	}
	
	@Autowired
	private TipoEntregaServiceImp tipoEntregaServ;
	
	@GetMapping("/tipoEntrega")
	public ResponseEntity<List<TipoEntrega> >tipoEntrega() throws Exception{
		return new ResponseEntity(tipoEntregaServ.listarTodos(),HttpStatus.OK);
	}
	
	@Autowired
	private TipoPagoServiceImp tipoPagoServ;
	
	@GetMapping("/tipoPago")
	public ResponseEntity<List<TipoPago> >tipoPago() throws Exception{
		return new ResponseEntity(tipoPagoServ.listarTodos(),HttpStatus.OK);
	}
	
	@Autowired
	private TipoUsuarioServiceImp tipoUsuarioServ;
	
	@GetMapping("/tipoUsuario")
	public ResponseEntity<List<TipoUsuario> >tipoUsuario() throws Exception{
		return new ResponseEntity(tipoUsuarioServ.listarTodos(),HttpStatus.OK);
	}
	
	@Autowired
	private UbigeoServiceImp ubigeoServ;
	
	@GetMapping("/ubigeo")
	public ResponseEntity<List<Ubigeo> >ubigeo() throws Exception{
		return new ResponseEntity(ubigeoServ.listarTodos(),HttpStatus.OK);
	}
	
	@Autowired
	private UnidadMedidaServiceImp unidadMedidaServ;
	
	@GetMapping("/unidadMedida")
	public ResponseEntity<List<UnidadMedida> >unidadMedida() throws Exception{
		return new ResponseEntity(unidadMedidaServ.listarTodos(),HttpStatus.OK);
	}
	
	

}
