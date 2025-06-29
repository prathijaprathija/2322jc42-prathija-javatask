package Day5;
import java.util.*;

class Student {
    int id;
    String name;
    double grade;

    // Constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // To display student info
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }



    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // Add student objects
        students.add(new Student(101, "Arun", 89.5));
        students.add(new Student(102, "Banu", 78.2));
        students.add(new Student(103, "Charan", 92.0));

        // Display using Iterator
        System.out.println("Student List:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s); // Calls toString() automatically
        }
    }
}



