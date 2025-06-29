package Day2;

import java.util.Scanner;

public class Split {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sent= scanner.nextLine();
       

        String[] words = sent.split("\\s+");

        System.out.println("Individual words:");
        for (String word: words){
            System.out.println(word);
 }
 }
	
}
