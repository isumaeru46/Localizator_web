package br.com.iesb.paradigmas.localizator.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	static {
	    try {
	      Class.forName("org.postgresql.Driver");
	    } catch (ClassNotFoundException e) {
	      System.err.println("PostgreSQL DataSource unable to load PostgreSQL JDBC Driver");
	    }
	  }
	
	public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://192.168.10.10:5432/localizator", "homestead", "secret");
        } catch (SQLException e) {
        	e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
