package Day3;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double bs,ir ,total;
	public void getdetial() {
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter the ID:");
		 id=sa.nextInt();
		
		System.out.println("Enter the name:");
		 name=sa.next();
		
		System.out.println("Enter the salary:");
		 bs=sa.nextDouble();
	}
	public void salarycal() {
		ir=5000;
		  total=bs - ir;
	}
	public void displaydetail() {
		System.out.println("insurance:"+ir);
		System.out.println("toatal salary:"+total);
	}
	public static void main(String[] args) {
		Employee em=new Employee();
		
		em.getdetial();
		em.salarycal();
		em.displaydetail();
		
	}

}
