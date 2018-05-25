package br.com.iesb.paradigmas.localizator.singletons;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.iesb.paradigmas.localizator.factories.ConnectionFactory;

public class SingletonDao {
	
	protected Boolean insert(String sql) throws SQLException {
		Boolean retorno = Boolean.FALSE;
		Connection connection = null;
		PreparedStatement stmt = null;
		try {
			connection = getConnection();
			stmt= connection.prepareStatement(sql);
			retorno = stmt.execute();
			connection.commit();
        } catch(SQLException e) {
        	connection.rollback();
        	fechaConexao(connection, stmt, null);
        	System.out.println(e);
        } finally {
        	fechaConexao(connection, stmt, null);
        }
		return retorno;
	}
	
	protected Boolean update(String sql) throws SQLException {
		Boolean retorno = Boolean.FALSE;
		Connection connection = null;
		PreparedStatement stmt = null;
		try {
			connection = getConnection();
			stmt= connection.prepareStatement(sql);
			retorno = stmt.execute();
			connection.commit();
        } catch(SQLException e) {
        	connection.rollback();
        	fechaConexao(connection, stmt, null);
        	System.out.println(e);
        } finally {
        	fechaConexao(connection, stmt, null);
        }
		return retorno;
	}
	
	protected Boolean delete(String sql) throws SQLException {
		Boolean retorno = Boolean.FALSE;
		Connection connection = null;
		PreparedStatement stmt = null;
		try {
			connection = getConnection();
			stmt= connection.prepareStatement(sql);
			retorno = stmt.execute();
			connection.commit();
        } catch(SQLException e) {
        	connection.rollback();
        	fechaConexao(connection, stmt, null);
        	System.out.println(e);
        } finally {
        	fechaConexao(connection, stmt, null);
        }
		return retorno;
	}
	
	protected ResultSet select (String sql, Connection con) throws SQLException{
	    PreparedStatement stmt = con.prepareStatement(sql);
	    ResultSet rs = stmt.executeQuery();
	    stmt.close();
		return rs;
	}
	
	protected Connection getConnection(){
		return new ConnectionFactory().getConnection();
	}
	
	protected void fechaConexao(Connection con,PreparedStatement stmt, ResultSet rs) throws SQLException{
		rs.close();
	    stmt.close();
	    con.close();
	}

}
