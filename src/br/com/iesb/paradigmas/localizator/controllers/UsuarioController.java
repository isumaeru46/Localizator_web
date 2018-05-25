package br.com.iesb.paradigmas.localizator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.iesb.paradigmas.localizator.models.RetornoModel;
import br.com.iesb.paradigmas.localizator.models.UsuarioModel;
import br.com.iesb.paradigmas.localizator.services.UsuarioService;

@Controller
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/usuario/logar", method = RequestMethod.GET)
	@ResponseBody
	public RetornoModel logar(UsuarioModel usuarioModel){
		return getUsuarioService().logar(usuarioModel);
	}
	
	public RetornoModel cadastrarNovoUsuario(UsuarioModel usuarioModel){
		return null;
	}
	
	public RetornoModel editarUsuario(UsuarioModel usuarioModel){
		return null;
	}
	
	public RetornoModel excluirUsuario(UsuarioModel usuarioModel){
		return null;
	}
	
	
	
	
	
	
	
	

	public UsuarioService getUsuarioService() {
		if (usuarioService == null) {
			usuarioService = new UsuarioService();
		}
		return usuarioService;
	}

}
