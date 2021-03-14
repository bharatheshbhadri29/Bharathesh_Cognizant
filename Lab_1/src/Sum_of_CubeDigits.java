/**
*Name : L BHARATHESH
*Description : Compilation and Running Sum of Cube of Digits of an n Digit Number
*Date : 14/03/2021
 */

import java.util.Scanner;
import java.lang.Math;

public class Sum_of_CubeDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
        while(num>0)
	    {
        	int n = num%10;
			sum += Math.pow(n,3);
	        num = num/10;
	    }
		System.out.println(sum);
	}

}
