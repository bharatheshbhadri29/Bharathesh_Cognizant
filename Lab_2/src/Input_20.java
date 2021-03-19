/**
*Name : L BHARATHESH
*Description : Compilation and Running A Java program to find the number of positive, negative, even, odd
* and zeros of 20 input integers.
*Date : 18/03/2021
 */

import java.util.*;

public class Input_20 {

	public static void main(String[] args) {
		
		int []arr = new int[20];
		int positive = 0, negative = 0, zero = 0, even = 0, odd = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 20 Integers");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive = positive + 1;
			}
			
			if (arr[i] < 0) {
				negative = negative + 1;
			}
			
			if (arr[i] == 0) {
				zero = zero + 1;
			}
			
			if (arr[i]%2 == 0) {
				even = even + 1;
			}
			
			if (arr[i]%2 != 0) {
				odd = odd + 1;
			}
		}
		
		System.out.println("Number of positiveitive Numbers is : " + positive);
		System.out.println("Number of negativeative Numbers is : " + negative);
		System.out.println("Number of Odd Numbers is : " + odd);
		System.out.println("Number of Even Numbers is : " + even);
		System.out.println("Number of 0s is : " + zero);
	}

}
