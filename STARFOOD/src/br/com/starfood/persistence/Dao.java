package br.com.starfood.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {  

	Connection con;
	PreparedStatement stmt;  
	Statement statement;  
	ResultSet rs;  

	private final String URL = "jdbc:mysql://http://localhost:8080/STARFOOD";  
	private final String USER = "admin";  
	private final String PASS = "admin";  

	protected void open()throws Exception{  
		Class.forName("com.mysql.jdbc.Driver");  
		con = DriverManager.getConnection(URL, USER, PASS);  
	}  

	protected void close()throws Exception{  
		con.close();  
	}  
}  
