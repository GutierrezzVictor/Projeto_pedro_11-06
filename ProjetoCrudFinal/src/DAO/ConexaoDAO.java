package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexaoDAO {
	public Connection conectaBD() {
		Connection conn= null;
		
		try {
			String url = "jdbc:sqlite:C:\\\\Users\\\\victo\\\\Downloads\\\\DB\\\\ProjetoCrudFinal.db";
			conn = DriverManager.getConnection(url);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return conn;
	}

}