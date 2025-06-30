package Day7;

	import java.sql.*;
	import java.util.Scanner;

	public class StudentDBManager {
	    static final String URL = "jdbc:mysql://localhost:3306/studentdb";
	    static final String USER = "root";
	    static final String PASS = "your_password";

	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        Connection conn = DriverManager.getConnection(URL, USER, PASS);

	        while (true) {
	            System.out.println("\n1. Add Student\n2. View All\n3. Search by Name\n4. Exit");
	            System.out.print("Choose: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            if (choice == 1) {
	                System.out.print("Enter Name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter Age: ");
	                int age = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter Grade: ");
	                String grade = sc.nextLine();

	                PreparedStatement ps = conn.prepareStatement("INSERT INTO students (name, age, grade) VALUES (?, ?, ?)");
	                ps.setString(1, name);
	                ps.setInt(2, age);
	                ps.setString(3, grade);
	                ps.executeUpdate();
	                System.out.println("Student added.");
	            } else if (choice == 2) {
	                Statement stmt = conn.createStatement();
	                ResultSet rs = stmt.executeQuery("SELECT * FROM students");
	                while (rs.next()) {
	                    System.out.println(rs.getInt("id") + " | " +
	                                       rs.getString("name") + " | " +
	                                       rs.getInt("age") + " | " +
	                                       rs.getString("grade"));
	                }
	            } else if (choice == 3) {
	                System.out.print("Enter name to search: ");
	                String name = sc.nextLine();
	                PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE name = ?");
	                ps.setString(1, name);
	                ResultSet rs = ps.executeQuery();
	                while (rs.next()) {
	                    System.out.println(rs.getInt("id") + " | " +
	                                       rs.getString("name") + " | " +
	                                       rs.getInt("age") + " | " +
	                                       rs.getString("grade"));
	                }
	            } else if (choice == 4) {
	                System.out.println("Goodbye!");
	                break;
	            }
	        }

	        conn.close();
	        sc.close();
	    }
	}

