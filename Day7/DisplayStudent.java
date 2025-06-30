package Day7;


	
	import java.sql.*;

	public class DisplayStudents {
	    public static void main(String[] args) {
	        try {
	            Connection conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/studentdb", "root", "your_password");

	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

	            while (rs.next()) {
	                System.out.println(rs.getInt("id") + " | " +
	                                   rs.getString("name") + " | " +
	                                   rs.getInt("age") + " | " +
	                                   rs.getString("grade"));
	            }
	            conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

