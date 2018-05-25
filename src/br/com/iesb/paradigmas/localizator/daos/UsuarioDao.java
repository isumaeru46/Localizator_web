package br.com.iesb.paradigmas.localizator.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.iesb.paradigmas.localizator.interfaces.UsuarioDaoInterface;
import br.com.iesb.paradigmas.localizator.models.UsuarioModel;
import br.com.iesb.paradigmas.localizator.singletons.SingletonDao;

public class UsuarioDao extends SingletonDao  implements UsuarioDaoInterface{
	
	private static final String SELECT = "SELECT * FROM USUARIOS";

	@Override
	public Integer create(String query) {
		String sql = "INSERT INTO curso (id, name) VALUES (" + query + ", " + query + ") ";
		try {
			insert(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Integer update(Long id, UsuarioModel usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioModel> findByName(String name) throws SQLException {
		List<UsuarioModel> retorno = new ArrayList<>();
		Connection conn = getConnection();
		StringBuilder query = new StringBuilder();
		query.append(SELECT);
		query.append("WHERE NOME = '" + name + "' ");
		ResultSet rs = select(query.toString(), conn);
		while (rs.next()){
			retorno.add(criaUsuario(rs));
		}
		return retorno;
	}
	
	public UsuarioModel findByLogin(String login) throws SQLException {
		UsuarioModel retorno = new UsuarioModel();
		Connection conn = getConnection();
		StringBuilder query = new StringBuilder();
		query.append(SELECT);
		query.append("WHERE LOGIN = '" + login + "' ");
		ResultSet rs = select(query.toString(), conn);
		if (rs.next()){
			retorno = criaUsuario(rs);
		}
		return retorno;
	}

	private UsuarioModel criaUsuario(ResultSet rs) throws SQLException {
		UsuarioModel usuario = new UsuarioModel();
		usuario.setNome(rs.getString("NOME"));
		//TODO - ISMAEL - TERMINAR DE COMPOR
		return usuario;
	}

	@Override
	public UsuarioModel findById(Long id) throws SQLException {
		UsuarioModel retorno = new UsuarioModel();
		Connection conn = getConnection();
		StringBuilder query = new StringBuilder();
		query.append(SELECT);
		query.append("WHERE ID = "+id);
		ResultSet rs = select(query.toString(), conn);
		if (rs.next()){
			retorno = criaUsuario(rs);
		}
		return retorno;
	}

	@Override
	public List<UsuarioModel> findAll() throws SQLException {
		List<UsuarioModel> retorno = new ArrayList<>();
		Connection conn = getConnection();
		StringBuilder query = new StringBuilder();
		query.append(SELECT);
		ResultSet rs = select(query.toString(), conn);
		while (rs.next()){
			retorno.add(criaUsuario(rs));
		}
		return retorno;
	}


}
