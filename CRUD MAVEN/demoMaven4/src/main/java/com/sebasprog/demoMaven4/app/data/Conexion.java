package com.sebasprog.demoMaven4.app.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Atributos que establecen la conexion
    private String db="BD_Admin_Emple";
    private Connection conex= null;
    private String usuario="Sebastian@admin-sfv";
    private String password="Forever16";
    private String url="jdbc:mysql://base11.mysql.database.azure.com:3306/"+db;

    public Conexion() {
    }

    public Conexion(String db, Connection conex,String usuario, String password, String url){
    super();
    this.db = db;
    this.conex=conex;
    this.usuario=usuario;
    this.password=password;
    this.url=url;
    }
   
    
    	public Connection getConnection() throws SQLException, ClassNotFoundException{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	conex=DriverManager.getConnection(url,usuario,password);
    	return conex;
    	}    
    
    
}