package Day1;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {
		Scanner sar=new Scanner(System.in);
		System.out.println("enter the Year:");
		int year=sar.nextInt();
			Leapyear(year );
	}
		public static  void Leapyear(int year) {
		
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println("This year is leapyear");
		}else {
			System.out.println("This year is not a leapyear");
		}
		}
	}


