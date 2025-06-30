package Day7;


	import java.sql.*;

	public class ConnectionDB {
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306//studentinfo";
	        String user = "root";
	        String password = "sunshine2006"; // Replace with your actual MySQL password

	        try {
	            ConnectionDB conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to MySQL database.");
	            conn.close();
	        } catch (SQLException e) {
	            System.out.println("Connection failed.");
	            e.printStackTrace();
	        }
	    }
	}

