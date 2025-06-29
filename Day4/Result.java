package Day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Result {


	    public static void main(String[] args) {
	        String inputFile = "D:\\marks.txt";
	        String outputFile = "D:\\result.txt";

	        try (
	            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
	        ) {
	            String line;
	            writer.write("RollNo,Name,Total,Average,Grade\n");

	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                String rollNo = parts[0];
	                String name = parts[1];
	                int m1 = Integer.parseInt(parts[2]);
	                int m2 = Integer.parseInt(parts[3]);
	                int m3 = Integer.parseInt(parts[4]);

	                int total = m1 + m2 + m3;
	                double average = total / 3.0;
	                String grade;

	                if (average >= 90) grade = "A+";
	                else if (average >= 80) grade = "A";
	                else if (average >= 70) grade = "B";
	                else if (average >= 60) grade = "C";
	                else if (average >= 50) grade = "D";
	                else grade = "F";

	                writer.write(rollNo + "," + name + "," + total + "," + average + "," + grade + "\n");
	            }

	            System.out.println("Results written to " + outputFile);
	        } catch (IOException e) {
	            System.out.println("Error processing file: " + e.getMessage());
	        }
	       }
	}


