/**
*Name : L BHARATHESH
*Description : Compilation and Running A number is said to be an increasing number if no 
digit is exceeded by the digit to its left.
*Date : 17/03/2021
 */

import java.util.Scanner;

public class Increasing_Number {
	
	public static boolean checkNumber(int number) {
		int lastDigit1 = number%10;
		number = number/10;
        int lastDigit2 = number%10;
		
		while(number>0)
        {
            if (lastDigit2 <= lastDigit1) {	
            	number = number/10;           	
            }
            else {
            	return false;
            }
            
            lastDigit1 = lastDigit2;
            lastDigit2 = number%10;
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
