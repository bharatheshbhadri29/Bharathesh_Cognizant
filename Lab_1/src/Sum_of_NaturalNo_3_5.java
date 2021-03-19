/**
*Name : L BHARATHESH
*Description : Compilation and Running Sum of n Natural number divisible by 3 or 5
*Date : 17/03/2021
 */

import java.util.Scanner;

public class Sum_of_NaturalNo_3_5 {
	
	public static int calculateSum(int number) {
		int sum = 0;
		
		for(int i = 0; i < number; i++) {
			if ((i % 3) ==  0 || (i % 5) == 0) {
				sum = sum + i;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a Number : ");
		Scanner x = new Scanner(System.in);
		int number = x.nextInt();
		
		
		int sum = calculateSum(n);
		System.out.println("The Sum of first " + number + " Natural Numbers Divisible by 3 or 5 is " + sum);
		
	}

}