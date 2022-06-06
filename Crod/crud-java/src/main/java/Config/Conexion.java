package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	Connection con;
	public Conexion() {
		try {
			Class.forName("com.mysql.jdbs.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost");
		}catch (Exception e) {
			System.err.println("Error"+e);
		}
	}
	public Connection getConnection() {
		return con;
	}
}