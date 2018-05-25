package br.com.iesb.paradigmas.localizator.services;

import java.sql.SQLException;
import java.util.List;

import br.com.iesb.paradigmas.localizator.daos.UsuarioDao;
import br.com.iesb.paradigmas.localizator.models.RetornoModel;
import br.com.iesb.paradigmas.localizator.models.UsuarioModel;

public class UsuarioService extends UtilService{
	
	private UsuarioDao dao;
	
	public RetornoModel logar(UsuarioModel usuario){
		return null;
	}

	public Integer create(UsuarioModel usuario) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public Integer update(Long id, UsuarioModel usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public RetornoModel find(Object value) {
		RetornoModel retorno = new RetornoModel();
		List<Object> usuarios;
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
	
	public UsuarioDao getDao() {
		return dao;
	}

}
