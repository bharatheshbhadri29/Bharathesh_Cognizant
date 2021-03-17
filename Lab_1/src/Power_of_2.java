/**
*Name : L BHARATHESH
*Description : Compilation and Running Check if the input number is the power of two.
*Date : 17/03/2021
 */

import java.util.Scanner;

public class Power_of_2 {
	
	public static boolean checkNumber(int number) {
		
		while (number > 1) {			
			if (number%2 == 0) {
				number = number/2;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a Number : ");
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
	
		boolean sum = checkNumber(n);
		System.out.println(sum);
	}
}