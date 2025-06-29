package Post_ClassDay1;

import java.io.*;
import java.util.*;

public class EmployeeCRUD {
    static final String FILE_NAME = "employee.txt";

    // Create Employee Record
    public static void addEmployee(String id, String name, String dept, String salary) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
        bw.write(id + "," + name + "," + dept + "," + salary);
        bw.newLine();
        bw.close();
        System.out.println("Employee added successfully.");
    }

    // Read All Employees
    public static void viewEmployees() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        System.out.println("ID\tName\tDepartment\tSalary");
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            System.out.println(data[0] + "\t" + data[1] + "\t" + data[2] + "\t\t" + data[3]);
        }
        br.close();
    }

    // Update Employee by ID
    public static void updateEmployee(String id, String newName, String newDept, String newSalary) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean updated = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[0].equals(id)) {
                bw.write(id + "," + newName + "," + newDept + "," + newSalary);
                updated = true;
            } else {
                bw.write(line);
            }
            bw.newLine();
        }

        br.close();
        bw.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);

        if (updated)
            System.out.println("Employee updated successfully.");
        else
            System.out.println("Employee ID not found.");
    }

    // Delete Employee by ID
    public static void deleteEmployee(String id) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean deleted = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (!data[0].equals(id)) {
                bw.write(line);
                bw.newLine();
            } else {
                deleted = true;
            }
        }

        br.close();
        bw.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);

        if (deleted)
            System.out.println("Employee deleted successfully.");
        else
            System.out.println("Employee ID not found.");
    }

    // Main method for testing
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Record System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    String salary = sc.nextLine();
                    addEmployee(id, name, dept, salary);
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID to Update: ");
                    id = sc.nextLine();
                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Department: ");
                    dept = sc.nextLine();
                    System.out.print("Enter New Salary: ");
                    salary = sc.nextLine();
                    updateEmployee(id, name, dept, salary);
                    break;

                case 4:
                    System.out.print("Enter ID to Delete: ");
                    id = sc.nextLine();
                    deleteEmployee(id);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
