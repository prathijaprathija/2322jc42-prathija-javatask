package Day3;

import java.util.Scanner;

public class Bank_Account {
	
	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		
		System.out.println("Enter the last transaction amount:");
		double amout=sd.nextDouble();
		double am= Deposit(amout); 
		 
		 double an=Withdraw(amout);
		  double cr=am+an;
		  System.out.println("Current Balance amount:"+cr);
		
	}
	public static double  Deposit(double amout) {
		double dpamount=20000;
		System.out.println("Deposit amount:"+dpamount);
		double am=amout+dpamount;
		return am;
	}
	public static double Withdraw(double amout) {
		double wdamount=10000;
		System.out.println("withdraw amount:"+wdamount);
		double an=amout-wdamount;
		return an;
		
	}
	


	

}
