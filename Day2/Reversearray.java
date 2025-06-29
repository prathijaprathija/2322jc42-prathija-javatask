package Day2;

import java.util.Arrays;

public class Reversearray {

	public static void main(String[] args) {
		 
		int [] arr= {1,2,3,4,5};
		 System.out.println("original number:"+Arrays.toString(arr));
		 
		 System.out.println("reverse:");
		 for(int i=arr.length-1;i>=0;i--) {
			 
			 System.out.print(+arr[i]+"");
		 }
	}
}
