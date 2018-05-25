package br.com.iesb.paradigmas.localizator.interfaces;

import java.sql.SQLException;
import java.util.List;

import br.com.iesb.paradigmas.localizator.models.UsuarioModel;

public interface UsuarioDaoInterface {
	
	public Integer create(String query) throws SQLException;
    public Integer update(Long id, UsuarioModel usuario) throws SQLException;
    public Integer delete(Long id) throws SQLException;
    public List<UsuarioModel> findByName(String name) throws SQLException;
    public List<UsuarioModel> findAll() throws SQLException;
    public UsuarioModel findById(Long id) throws SQLException;

}
