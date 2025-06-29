package Post_ClassDay1;

import java.util.Scanner;

public class Student_Marks {
	
	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=sd.next();
		
		System.out.println("Enter the paper1:");
		int p1=sd.nextInt();
		
		System.out.println("Enter the paper2:");
		int p2=sd.nextInt();
		
		System.out.println("Enter the paper3:");
		int p3=sd.nextInt();
		
		System.out.println("Enter the paper4:");
		int p4=sd.nextInt();
		
		int total=p1+p2+p3+p4;
		double average=total/4.0;
		 
		int avg =(int)(average/10);
		
		String grade;
		
		switch(avg) {
		
		case 9:
			grade="A+";
			break;
		case 8:
			grade="A";
			break;
			
		case 7:
				grade="B";
				break;
		case 6:
			grade="C";
			break;
		case 5:
			grade="D";
			break;
			
		default:
			grade="F";
		
		}
		System.out.println("Total:"+total);
		System.out.println("Average:"+average);
		System.out.println("Grade:"+grade);
	}

}
