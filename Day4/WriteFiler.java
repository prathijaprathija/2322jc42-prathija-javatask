package Day4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFiler {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String fn="D:\\workspace\\Fs\\src\\jp\\Hello.txt";
				
		try {
			FileWriter fw=new FileWriter(fn);
			
			System.out.println("Enter lines to the file (type exit to stop:");
			
			while(true) {
				String line=sc.next();
				if(line.equalsIgnoreCase("exit")) {
					break;
				}
				fw.write(line +"\n");
			}
			fw.close();
			System.out.println("data writensuccessfully");
		}catch(IOException e){
			System.out.println("An error occurred while wirting to invalid ");
			e.printStackTrace();
			
		}
	}

}
