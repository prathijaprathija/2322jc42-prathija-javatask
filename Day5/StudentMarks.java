package Day5;

 import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {
        // Create a HashMap to store student name → marks
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Add students and their marks
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 92);

        // Calculate total and average
        int total = 0;
        for (int mark : studentMarks.values()) {
            total += mark;
        }

        double average = (double) total / studentMarks.size();

        // Print all student marks
        System.out.println("Student Marks:");
        for (String name : studentMarks.keySet()) {
            System.out.println(name + ": " + studentMarks.get(name));
        }

        // Print average
        System.out.println("Average Marks: " + average);
    }
}
