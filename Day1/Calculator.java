package Day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner set=new Scanner(System.in);
		
	 System.out.println("Enter The value A:");
	 int a=set.nextInt();
	 
	 System.out.println("Enter The value B:");
	 int b=set.nextInt();
	   
	 System.out.println("Choise opeartion");
	 System.out.println("1.Addtion");
	 System.out.println("2.Subraction");
	 System.out.println("3.Multiplication");
	 System.out.println("4.Division");
	 System.out.println("5.M66odulo");
	 
	 System.out.println("Enter the choice:");
	 int cho=set.nextInt();
	 
	 int result;
	  switch(cho) {
	  case 1:
		  result=a+b;
		  System.out.println("The  result :"+result);
		  break;
	  case 2:
		  result=a-b;
		  System.out.println("The  result :"+result);
		  break;
	  case 3:
		  result=a*b;
		  System.out.println("The  result :"+result);
		  break;
	  case 4:
		    result=a/b;
		  System.out.println("The  result :"+result);
		  break;
	  case 5:
		    float result1=a%b;
		    System.out.println("The  result :"+result1);
		    break;
	  default:
	      System.out.println("default choice");
		  
	  }
	}

}
