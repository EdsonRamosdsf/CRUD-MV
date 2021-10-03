package DesafioMV;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class CNXJDBC {
	
	public static Connection conn;
	public static Statement stmt;
	static {
		try {
			CNXJDBC.conn = conn();
			stmt = CNXJDBC.conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection conn() throws SQLException {
		return DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=ProjetoMV;integratedSecurity=true;");
		
	}
	
	
}


