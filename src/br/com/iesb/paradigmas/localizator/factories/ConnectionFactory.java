package br.com.iesb.paradigmas.localizator.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/localizator", "homestead", "secret");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
