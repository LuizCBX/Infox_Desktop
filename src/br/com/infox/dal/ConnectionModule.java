package br.com.infox.dal;
import java.sql.*;
public class ConnectionModule {
	public static Connection conector() {
		java.sql.Connection conection = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://10.26.45.103:3306/dbinfox?useSSL=false";
		String user = "admin";
		String password = "123@Senac";
		try {
			Class.forName(driver);
			conection = DriverManager.getConnection(url, user, password);
			return conection;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
