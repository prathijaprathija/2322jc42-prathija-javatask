package Day4;

import java.util.Scanner;

public class Zero {
	public static void main(String[] args) {
		Scanner cv=new Scanner(System.in);
		
		try {
			System.out.println("Enter the numerator:");
			int nu=cv.nextInt();
			System.out.println("Enter the denominrator:");
			int dm=cv.nextInt();
			
			int res=nu/dm;
			
			System.out.println("Result:"+res);
		}
		catch(ArithmeticException e) {
	   System.out.println("Zero is invalid input");
	}
	}
}
