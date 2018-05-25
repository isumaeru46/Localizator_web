package br.com.iesb.paradigmas.localizator.controllers;

import br.com.iesb.paradigmas.localizator.models.RetornoModel;
import br.com.iesb.paradigmas.localizator.models.UsuarioModel;
import br.com.iesb.paradigmas.localizator.services.UsuarioService;

public class UsuarioController {
	
	private UsuarioService usuarioService;
	
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
