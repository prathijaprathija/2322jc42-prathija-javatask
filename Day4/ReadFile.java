package Day4;

 
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class ReadFile {
	    public static void main(String[] args) {
	        String fileName = "D:\\workspace\\Fs\\src\\jp\\Hello.txt";  // Change to your file name or path

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));
	            String line;

	            System.out.println("File Content:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            reader.close();
	        } catch (IOException e) {
	            System.out.println(" Error reading file: " + e.getMessage());
}
}
}



