package br.com.iesb.paradigmas.localizator.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.iesb.paradigmas.localizator.daos.UsuarioDao;
import br.com.iesb.paradigmas.localizator.interfaces.ServiceInterface;
import br.com.iesb.paradigmas.localizator.models.RetornoModel;
import br.com.iesb.paradigmas.localizator.models.UsuarioModel;

public class UsuarioService extends UtilService implements ServiceInterface{
	
	private UsuarioDao dao;
	
	@Override
	public RetornoModel create(UsuarioModel usuario) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public RetornoModel update(Long id, UsuarioModel usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetornoModel delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetornoModel find(Object value) {
		RetornoModel retorno = new RetornoModel();
		//List<Object> usuarios;
		if(isNumero(value.toString())){
			try {
				getDao().findById(new Long(value.toString()));
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
			}
		}else{
			//usuarios = (List<Object>) getDao().findByName(query.toString());
		}
		//retorno.setConteudo(usuarios);
		return retorno;
	}
	
	public RetornoModel logar(UsuarioModel usuarioRequest){
		UsuarioModel usuarioModel = null;
		RetornoModel retornoModel = new RetornoModel();
		try {
			usuarioModel = getDao().findByLogin(usuarioRequest.getLogin());
		} catch (SQLException e) {
			retornoModel.setMensagem("Ocorreu um erro inesperado!");
			retornoModel.setSucesso(Boolean.FALSE);
			e.printStackTrace();
		}
		if(usuarioModel != null) {
			if(usuarioModel.getSenha().equals(usuarioRequest.getSenha())) {
				retornoModel.setMensagem("Logado com sucesso!");
				retornoModel.setSucesso(Boolean.TRUE);
				ArrayList<UsuarioModel> retornoUsuario = new ArrayList<>();
				retornoUsuario.add(usuarioModel);
				retornoModel.setConteudo(retornoUsuario);
			}else {
				retornarUsuarioOuSenhaInvalida(retornoModel);
			}
		}else {
			retornarUsuarioOuSenhaInvalida(retornoModel);
		}
		return retornoModel;
	}
	
	public RetornoModel retornarTodosUsuarios() {
		RetornoModel retornoModel = new RetornoModel();
		retornoModel.setMensagem("Lista de Usuários");
		retornoModel.setSucesso(Boolean.TRUE);
		List<UsuarioModel> usuarios = null;
		try {
			usuarios = getDao().findAll();
		} catch (SQLException e) {
			retornoModel.setMensagem("Ocorreu um erro inesperado!");
			retornoModel.setSucesso(Boolean.FALSE);
			e.printStackTrace();
		}
		retornoModel.setConteudo(usuarios);
		
		return retornoModel;
	}

	private void retornarUsuarioOuSenhaInvalida(RetornoModel retornoModel) {
		retornoModel.setMensagem("Usuário ou senha inválidos!");
		retornoModel.setSucesso(Boolean.FALSE);
	}

	
	private UsuarioDao getDao() {
		if (dao == null) {
			dao = new UsuarioDao();
		}
		return dao;
	}

	

}
