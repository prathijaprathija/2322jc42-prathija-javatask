package Day1;

import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principle amount:");
		double principle=sc.nextFloat();
		
		System.out.println("Enter the rate amount:");
		double rate=sc.nextFloat();
		
		System.out.println("Enter the time amount:");
		double time=sc.nextFloat();
		
		double si=( principle*rate*time)/100;
		
		System.out.println("Simple interest:"+si);
		
		
		if(si<100000) {
			System.out.println("profit");
		}else {
			System.out.println("lose");
		}
		
		
				
	}
	

}
