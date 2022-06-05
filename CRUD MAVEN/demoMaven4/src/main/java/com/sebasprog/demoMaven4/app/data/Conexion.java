package com.sebasprog.demoMaven4.app.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	final String JDBC_DRIVER = "com.myqsl.cj.jdbc.Driver";
	final String DB_URL = "jdbs:mysql://localhost/BD_Admin_Emple"
		
	}
	

	/*private String db="BD_Admin_Emple";
	private Connection cnx=null;
	private String usuario="root";
	private String password="Forever16";
	private String url="jdbs:mysql://localhost:3306/BD_Admin_Emple"+db;
	
	public Conexion() {
		
	}

	public Conexion(String db, Connection cnx, String usuario, String password, String url) {
		super();
		this.db = db;
		this.cnx = cnx;
		this.usuario = usuario;
		this.password = password;
		this.url = url;
	}
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.myqsl.cj.jdbc.Driver");
		cnx=DriverManager.getConnection(url,usuario,password);
		return cnx;
	}*/
}
