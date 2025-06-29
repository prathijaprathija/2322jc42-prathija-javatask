
package Day2;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a character:");
        String chit= sn.nextLine().toLowerCase();
       
        
       // char ch=chit.charAt(0);
        int VowelCount=0;
         for(char ch:chit.toCharArray()) {
         if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
        	 VowelCount++;

            System.out.println(" vowels count:"+ VowelCount); 
           
            
        }
        }
}
}
    
