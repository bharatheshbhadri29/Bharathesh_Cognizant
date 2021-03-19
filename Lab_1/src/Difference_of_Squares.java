/**
*Name : L BHARATHESH
*Description : Compilation and Running Find the difference between the sum of the 
*squares of the first n natural numbers and the square of their sum.
*Date : 17/03/2021
 */

import java.util.Scanner;
import java.lang.Math;

public class Difference_of_Squares {
	/**
	 * calculateDifference method computes the difference between the sum of the 
	 * squares of the first n natural numbers and the square of their sum.
	 * @param k
	 * @return difference b/w sum of square to square of sum
	 */
	public static int calculateDifference(int k) {
		
		int sum = 0 , sumOfSquares = 0, squareOfSum = 0;
		for(int i = 0; i <= k; i++) {
			sumOfSquares = sumOfSquares + i*i;
			squareOfSum = squareOfSum + i;
		}
		sum = (int) (sumOfSquares - Math.pow(squareOfSum, 2));
		return sum;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a Number : ");
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		
		
		int sum = calculateDifference(n);
		System.out.println("The Difference of first " + n + " Natural Numbers is " + sum);

	}

}
