package Post_ClassDay1;


	import java.util.*;
	import java.io.*;

	public class StudentManager {
	    static ArrayList<String> studentNames = new ArrayList<>();
	    static HashMap<Integer, ArrayList<String>> studentCourses = new HashMap<>();
	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n1. Add Student");
	            System.out.println("2. Search Student");
	            System.out.println("3. Delete Student");
	            System.out.println("4. Add Course to Student");
	            System.out.println("5. Display All");
	            System.out.println("6. Save to File");
	            System.out.println("7. Exit");
	            System.out.print("Choose: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1 -> addStudent();
	                case 2 -> searchStudent();
	                case 3 -> deleteStudent();
	                case 4 -> addCourse();
	                case 5 -> displayAll();
	                case 6 -> saveToFile();
	                case 7 -> {
	                    System.out.println("Exiting...");
	                    return;
	                }
	                default -> System.out.println("Invalid option.");
	            }
	        }
	    }

	    static void addStudent() {
	        System.out.print("Enter student name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter student ID (number): ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        if (!studentCourses.containsKey(id)) {
	            studentNames.add(name);
	            studentCourses.put(id, new ArrayList<>());
	            System.out.println("Student added.");
	        } else {
	            System.out.println("Student ID already exists.");
	        }
	    }

	    static void searchStudent() {
	        System.out.print("Enter student ID to search: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        if (studentCourses.containsKey(id)) {
	            System.out.println("Student ID found. Courses: " + studentCourses.get(id));
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    static void deleteStudent() {
	        System.out.print("Enter student ID to delete: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        if (studentCourses.containsKey(id)) {
	            studentCourses.remove(id);
	            System.out.println("Student deleted.");
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    static void addCourse() {
	        System.out.print("Enter student ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        if (studentCourses.containsKey(id)) {
	            System.out.print("Enter course name: ");
	            String course = scanner.nextLine();
	            studentCourses.get(id).add(course);
	            System.out.println("Course added.");
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    static void displayAll() {
	        System.out.println("\nStudent Records:");
	        for (int id : studentCourses.keySet()) {
	            System.out.println("ID: " + id + " → Courses: " + studentCourses.get(id));
	        }
	    }

	    static void saveToFile() {
	        try {
	            FileWriter writer = new FileWriter("courses.txt");
	            for (int id : studentCourses.keySet()) {
	                writer.write("ID: " + id + " → " + studentCourses.get(id) + "\n");
	            }
	            writer.close();
	            System.out.println("Data saved to courses.txt");
	        } catch (IOException e) {
	            System.out.println("Error writing to file.");
	        }
	    }
	}