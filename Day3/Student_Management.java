package Day3;

import java.util.Scanner;

public class Student_Management {
	
	int ag , total;
	int mr1=50,mr2=60,mr3=80;
	
	public void student() {
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Enter the student:");
		String name =sn.next();
		
		System.out.println("Enter the rollno:");
		int ro=sn.nextInt();
		
	}
	public void Assignmentmark() {
		ag=25;
		
	} public void Result() {
		total=mr1+mr2+mr3+ag;
		System.out.println("Student   Result" );
		System.out.println("Mark1:"+mr1+  "   P");
		System.out.println("Mark2:"+mr2+  "   P");
		System.out.println("Mark3:"+mr3+  "   P");
		System.out.println("Assignment Mark:"+ag);
		System.out.println("Resutl:"+total);
		
	}
public static void main(String[] args) {
	Student_Management sm=new Student_Management();
	sm.student();
	sm.Assignmentmark();
	sm.Result();
	
}
}
