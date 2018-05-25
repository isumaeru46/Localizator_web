package br.com.iesb.paradigmas.localizator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.iesb.paradigmas.localizator.models.RetornoModel;
import br.com.iesb.paradigmas.localizator.models.UsuarioModel;
import br.com.iesb.paradigmas.localizator.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/logar", method = RequestMethod.GET)
	public @ResponseBody RetornoModel logar(/*@RequestParam(value="login", required=true) String login, @RequestParam(value="senha", required=true) String senha*/){
		//UsuarioModel usuarioModel = new UsuarioModel(login,senha);
		//return getUsuarioService().logar(usuarioModel);
		RetornoModel retornoModel = new RetornoModel();
		retornoModel.setMensagem("Usuário Logado!!");
		retornoModel.setSucesso(Boolean.TRUE);
		return retornoModel;
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
