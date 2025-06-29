package Day2;

import java.util.Scanner;

public class Stringanalyzer {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the sentence: ");
	String sen=sc.nextLine();
	//word count
	String[] words=sen.split("\\s+");//this line use split word and make as array
	int wc=words.length;//this line is use count length words 
	
	System.out.println("Word Count:"+wc);
	
	
	
	int chcount=sen.replaceAll("\\+s","").length();
	System.out.println("character count:"+chcount);
	
	String reverse=new StringBuilder(sen).reverse().toString();
	System.out.println("Reverse:"+reverse);
	
	
	
	
	
	
	
			
}
}
