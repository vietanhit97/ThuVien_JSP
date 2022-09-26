package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	private  static Connection con = null;
	static
    {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=DBStudent;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String pass = "sa";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
	 public static Connection getConnection()
	    {
	        return con;
	    }

}
