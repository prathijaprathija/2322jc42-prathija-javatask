package Day5;


	import java.util.*;

	public class StudentSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        ArrayList<String> students = new ArrayList<>();

    
    HashMap<String, ArrayList<String>> studentCourses = new HashMap<>();

    while (true) {
        System.out.println("\n1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Enroll Course");
        System.out.println("4. Display Students and Courses");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        switch (choice) {
            case 1:
                System.out.print("Enter student name: ");
                String student = scanner.nextLine();
                if (!students.contains(student)) {
                    students.add(student);
                    studentCourses.put(student, new ArrayList<>());
                    System.out.println("Student added.");
                } else {
                    System.out.println("Student already exists.");
                }
                break;

            case 2:
                System.out.print("Enter student name to remove: ");
                String removeName = scanner.nextLine();
                if (students.remove(removeName)) {
                    studentCourses.remove(removeName);
                    System.out.println("Student removed.");
                } else {
                    System.out.println("Student not found.");
                }
                break;

            case 3:
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();
                if (students.contains(studentName)) {
                    System.out.print("Enter course to enroll: ");
                    String course = scanner.nextLine();
                    studentCourses.get(studentName).add(course);
                    System.out.println("Course added.");
                } else {
                    System.out.println("Student not found.");
                }
                break;

            case 4:
                System.out.println("\nStudents and their Courses:");
                Iterator<String> it = students.iterator();
                while (it.hasNext()) {
                    String name = it.next();
                    System.out.println("- " + name + ": " + studentCourses.get(name));
                }
                break;

            case 5:
                System.out.println("Exiting...");
                scanner.close();
                return;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
}

