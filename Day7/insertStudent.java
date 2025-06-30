package Day7;


	import java.sql.*;

	public class insertStudent {
	    public static void main(String[] args) {
	        try {
	            Connection conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/studentdb", "root", "your_password");

	            String query = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
	            PreparedStatement ps = conn.prepareStatement(query);

	            ps.setString(1, "Alice");
	            ps.setInt(2, 20);
	            ps.setString(3, "A");

	            int result = ps.executeUpdate();
	            System.out.println(result + " record inserted.");
	            conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

	