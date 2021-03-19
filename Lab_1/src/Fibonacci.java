/**
*Name : L BHARATHESH
*Description : Compilation and Running Fibonacci
*Date : 14/03/2021
 */

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int t1 = 0, t2 = 1;
		System.out.println("Enter the Number n: ");
		Scanner x = new Scanner(System.in);
		int nth_Number = x.nextInt();
		int s = 0;
		
        for (int i = 2; i <= nth_Number; ++i)
        {
            s = t1 + t2;
            t1 = t2;
            t2 = s;
        }
        System.out.println("Nth Digit of Fibonacci Series is : " + s);
}
}