package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	private static Connection con = null ;
		public static Connection getConnection() {
			
			try {
				DriverManager.registerDriver( new com.microsoft.sqlserver.jdbc.SQLServerDriver());
				con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=btl12;encrypt=true;trustServerCertificate=true;","sa","sa");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
}
